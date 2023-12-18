import java.util.*;

public class Main {
    static int cnt;
    static int a;
    static int b;
    static String p;
    static String q;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        p = genStrWithoutSpace(sc.nextLine());
        q = genStrWithoutSpace(sc.nextLine());
        //System.out.println("n = " + n);
        //System.out.println("p = " + p);
        //System.out.println("q = " + q);
        int[] ar = genArray(n);
        //System.out.println("ar = " + Arrays.toString(ar));
        permutation(ar, n, new StringBuilder(), n);
        //System.out.println("a = " + a);
        //System.out.println("b = " + b);
        System.out.println(Math.abs(a - b));
    }
    
    static int[] genArray(int size) {
        int[] res = new int[size];
        for(int i = 0; i < size; ++i) res[i] = i + 1;
        return res;
    }
    
    static void permutation(int[] ar, int arSize, StringBuilder sb, int size) {
        if(sb.length() == size) {
            String resPerm = sb.toString();
            ++cnt;
            //System.out.println(cnt + ": " + resPerm);
            if(resPerm.equals(p)) a = cnt;
            if(resPerm.equals(q)) b = cnt;
        } else {
            for(int i = 0; i < arSize; ++i) {
                sb.append(ar[i]);
                permutation(genSubarray(ar, arSize, i), arSize - 1, sb, size);
            }
        }
        if(sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
    }
    
    static int[] genSubarray(int[] ar, int arSize, int skipIndex) {
        int[] subarray = new int[arSize - 1];
        for(int i = 0, subi = 0; i < arSize; ++i) {
            if(i != skipIndex) {
                subarray[subi] = ar[i];
                ++subi;
            }
        }
        return subarray;
    }
    
    static String genStrWithoutSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0, f = s.length(); i < f; ++i) {
            char c = s.charAt(i);
            if(c != ' ') sb.append(c);
        }
        return sb.toString();
    }
}
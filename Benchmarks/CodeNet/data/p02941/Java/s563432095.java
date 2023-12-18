
import java.util.*;

public class Main {
    int mod = 998244353;
    static int n;
    static int count = 0;
    static Set<Integer> c = new HashSet<>();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            c.add(i+n);
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        int[] re = method(a,b);
        // dump(a);
        // dump(b);
        // dump(re);
        if(check(a, re)){
            System.out.println(count);
        }
        else{
            System.out.println(-1);
        }
    }

    public static void dump(int[] p) {
        for(int i=0;i<n;i++){
            System.out.print(p[i] + " ");
        }
        System.out.println();
        return;
    }

    public static boolean check(int[] a, int[] b) {
        for(int i=0;i<n;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }

    static public int[] method(int[] a, int[] b) {
        boolean is = false;
        Set<Integer> ct = new HashSet<>();
        for(Integer i : c){
            if(b[i%n] >= a[i%n]){
                int tmp = b[i%n]-b[(i-1)%n]-b[(i+1)%n];
                if(tmp>=a[i%n]){
                    b[i%n] = tmp;
                    count++;
                    is = true;
                    if(tmp==a[i%n])continue;
                }
            }
            ct.add(i);
        }
        if(is)b = method(a, b);
        return b;
    }
}
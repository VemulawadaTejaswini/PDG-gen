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
        List<Integer> list = genList(n);
        permutation(list, new StringBuilder(), n);
        System.out.println(Math.abs(a - b));
    }
    
    static List<Integer> genList(int size) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < size; ++i) res.add(i + 1);
        return res;
    }
    
    static void permutation(List<Integer> list, StringBuilder sb, int size) {
        if(sb.length() == size) {
            String resPerm = sb.toString();
            ++cnt;
            if(resPerm.equals(p)) a = cnt;
            if(resPerm.equals(q)) b = cnt;
        } else {
            for(int i = 0, f = list.size(); i < f; ++i) {
                sb.append(list.get(i));
                permutation(genSublist(list, i), sb, size);
            }
        }
        if(sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
    }
    
    static List<Integer> genSublist(List<Integer> list, int skipIndex) {
        List<Integer> sublist = new ArrayList<>();
        for(int i = 0, f = list.size(); i < f; ++i) {
            if(i != skipIndex) sublist.add(list.get(i));
        }
        return sublist;
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
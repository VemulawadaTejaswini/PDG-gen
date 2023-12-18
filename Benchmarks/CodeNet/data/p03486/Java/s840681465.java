import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        Arrays.sort(s);
        String ss = new String(s);
        String ts = new String(t);
        ts = new StringBuilder(ts).reverse().toString();
        System.out.println(ss.compareTo(ts) < 0 ? "Yes" : "No");
    }
}

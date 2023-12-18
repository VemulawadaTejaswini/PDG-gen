import java.util.*;

public class Main {
    public static Set<String> ans = new HashSet<>();

    public static void main(String[] args) {

        // 
        Scanner sc = new Scanner(System.in);
        // 
        int N = sc.nextInt();
        // 
        String S = sc.next();
        String c = "";
        Main.solve(c, 0, S);
        System.out.println(Main.ans.size());


    }
    public static void solve(String c, int idx,  String S) {
        if (c.length() == 3) {
            Main.ans.add(c);
            return;
        }

        if (idx >= S.length()) {
            return;
        }
        StringBuilder buff = new StringBuilder();
        buff.append(c);
        buff.append(S.charAt(idx));
        Main.solve(buff.toString(), idx+1, S);
        Main.solve(c, idx+1, S);
        return;

    }
}
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);

    void solve() {
        List<String> ans = new ArrayList<>();
        String s = "";
        while (true) {
            String tmp = sc.nextLine();
            if (tmp.equals("-")) {
                ans.add(s);
                break;
            } else if (isNum(tmp)) {
                int n = Integer.parseInt(tmp);
                s = s.substring(n, s.length()) + s.substring(0, n);
            } else {
                ans.add(s);
                s = tmp;
            }
        }
        for (int i = 0; i < ans.size(); ++i) {
            System.out.println(ans.get(i));
        }
    }

    boolean isNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}





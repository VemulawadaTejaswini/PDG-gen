import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        String ans[][] = new String[a.length()][b.length()];

        System.out.println(getLCS(a, b));
        System.out.println(getLCSMemo(a, b, 0, 0, ans) + " visited is " + visited);

    }

    public static int visited = 0;

    public static String getLCS(String a, String b) {
        if (b.length() == 0 || a.length() == 0) {
            return "";
        }
        String hans = "";
        if (a.charAt(0) == b.charAt(0)) {
            hans = a.substring(0, 1) + getLCS(a.substring(1), b.substring(1));
        } else {
            for (int i = 0; i < b.length(); i++) {
                if (a.charAt(0) == b.charAt(i)) {
                    hans = a.substring(0, 1) + getLCS(a.substring(1), b.substring(i + 1));
                    break;
                }
            }
        }
        String hans2 = getLCS(a.substring(1), b);
        // if (hans == null) {
        // return hans2;
        // } else if (hans2 == null) {
        // return hans;
        // } else {
        return (hans.length() > hans2.length() ? hans : hans2);
        // }

    }

    public static String getLCSMemo(String a, String b, int x, int y, String ans[][]) {

        if (b.length() - 1 < y || a.length() - 1 < x) {
            return "";
        }
        if (ans[x][y] != null) {
            visited++;
            return ans[x][y];
        }
        String hans = "";
        if (a.charAt(x) == b.charAt(y)) {
            hans = a.substring(x, x + 1) + getLCSMemo(a, b, x + 1, y + 1, ans);
        } else {
            for (int i = y; i < b.length(); i++) {
                if (a.charAt(x) == b.charAt(i)) {
                    hans = a.substring(x, x + 1) + getLCSMemo(a, b, x + 1, i + 1, ans);
                    break;
                }
            }
        }
        String hans2 = getLCSMemo(a, b, x + 1, y, ans);
        // if (hans == null) {
        // return hans2;
        // } else if (hans2 == null) {
        // return hans;
        // } else {
        ans[x][y] = (hans.length() > hans2.length() ? hans : hans2);
        return ans[x][y];
        // }

    }
}
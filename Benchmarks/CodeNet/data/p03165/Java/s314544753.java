import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        String ans[][] = new String[a.length()][b.length()];

        // System.out.println(getLCS(a, b));
        System.out.println(getLCSMemo(a, b, 0, 0, ans));

    }

    public static int visited = 0;

   
    

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
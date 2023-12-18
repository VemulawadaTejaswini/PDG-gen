import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[] as = new String[n];
        String[] bs = new String[m];
        for (int i = 0; i < n; i++){
            as[i] = sc.nextLine();
        }
        for (int i = 0; i < m; i++){
            bs[i] = sc.nextLine();
        }
        int matchCol = -1;
        for (int i = 0; i < m; i++) {
            if (as[i].contains(bs[i])) {
                matchCol = i;
                break;
            }
        }
        if (matchCol == -1) {
            System.out.println("No");
        } else {
            int matchRow = as[matchCol].indexOf(bs[matchCol]);
            boolean flag = true;
            for (int i = 0; i < m; i++) {
                if (i + matchCol == n) {
                    flag = false;
                    break;
                }
                String subStr = as[i + matchCol].substring(matchRow, matchRow + m);
                if (!subStr.equals(bs[i])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
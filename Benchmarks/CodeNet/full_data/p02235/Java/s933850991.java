import java.util.Scanner;

public class Main {

    public static String a = "";
    public static String b = "";
    public static int[][] mm = new int[a.length()][b.length()];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] dataset = new String[n][2];
        for (int i = 0 ; i < n ; i++) {
            dataset[i][0] = scanner.next();
            dataset[i][1] = scanner.next();
        }

        for (int p = 0 ; p < n ; p++) {
            a = dataset[p][0];
            b = dataset[p][1];
            mm = new int[a.length()][b.length()];
            for (int i = 0 ; i < mm.length ; i++) {
                for (int j = 0 ; j < mm[i].length ; j++) {
                    mm[i][j] = -1;
                }
            }
            System.out.println(lcs(0, 0));
        }
        scanner.close();
    }

    public static int lcs(int i, int j) {
        if (i < a.length() && j < b.length() && mm[i][j] != -1) {
            return mm[i][j];
        }
        int s = 0;
        if (i == a.length() || j == b.length()) {
            return 0;
        } if (a.charAt(i) == b.charAt(j)) {
            s = lcs(i+1, j+1)+1;
        } else {
            s += Math.max(lcs(i+1,j), lcs(i,j+1));
        }
        mm[i][j] = s;
        return s;
    }

}


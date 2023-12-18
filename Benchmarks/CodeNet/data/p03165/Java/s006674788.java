import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Str1 = in.nextLine();
        String Str2 = in.nextLine();

        String[][] memo = new String[Str1.length() + 1][Str2.length() + 1];
        for (int i = 1; i <= Str1.length(); i++) {
            for (int j = 1; j <= Str2.length(); j++) {
                if (Str1.charAt(i - 1) == Str2.charAt(j - 1)) {
                    memo[i][j] = (memo[i - 1][j - 1] == null ? "" :  memo[i - 1][j - 1]) + Str1.charAt(i - 1);
                } else {
                    String value1 = memo[i - 1][j] == null ? "" : memo[i - 1][j];
                    String value2 = memo[i][j - 1] == null ? "" : memo[i][j - 1];

                    if (value1.length() > value2.length()) {
                        memo[i][j] = value1;
                    } else {
                        memo[i][j] = value2;
                    }
                }
            }
        }
        in.close();
        System.out.println(memo[Str1.length()][Str2.length()]);
    }
}
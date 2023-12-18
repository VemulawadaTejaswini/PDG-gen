import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] Str1 = in.nextLine().toCharArray();
        char[] Str2 = in.nextLine().toCharArray();

        in.close();

        int[][] memo = new int[Str1.length + 1][Str2.length + 1];
        for (int i = 1; i <= Str1.length; i++) {
            for (int j = 1; j <= Str2.length; j++) {
                memo[i][j] = Str1[i - 1] == Str2[j - 1]
                        ? memo[i][j] = memo[i - 1][j - 1] + 1
                        : Math.max(memo[i - 1][j], memo[i][j - 1]);
            }
        }


        char[] lcs = new char[memo[Str1.length][Str2.length]];
        int i = Str1.length;
        int j = Str2.length;
        while (memo[i][j] > 0) {
            if (memo[i - 1][j] == memo[i][j]) {
                i--;
            } else if (memo[i][j - 1] == memo[i][j]) {
                j--;
            } else {
                lcs[memo[--i][--j]] = Str1[i];
            }
        }
        System.out.println(new String(lcs));
    }
}
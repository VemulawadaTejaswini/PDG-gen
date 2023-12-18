import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] tab = new int[n][2];
        for (int i = 0; i < n; i++) {
            tab[i][0] = sc.nextInt();
            tab[i][1] = sc.nextInt();
        }
        int[] dp = new int[h+10000];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if(i >= tab[j][0] && dp[i - tab[j][0]] < Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - tab[j][0]] + tab[j][1]);
                }
            }
        }
        int min = Arrays.stream(dp)
                .skip(h)
                .min()
                .getAsInt();
        System.out.println(min);
    }

    private static int compare(int[] a, int[] b, int remaining) {
        double a0 = Math.min(a[0], remaining);
        double b0 = Math.min(b[0], remaining);
        return (int) Math.signum(a0 / ((double) a[1]) - b0 / ((double) b[1]));
    }

    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }

    private static int[] toArray(String text) {
        return Arrays.stream(text.split("\\s")).mapToInt(Integer::valueOf).toArray();
    }

}
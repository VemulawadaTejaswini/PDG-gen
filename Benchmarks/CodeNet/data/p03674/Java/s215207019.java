import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNumber = scanner.nextInt() + 1;
        int[] numbers = new int[numOfNumber];
        for (int i = 0; i < numOfNumber; i++) {
            numbers[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numOfNumber; i++) {
            if (map.containsKey(numbers[i]) == false) {
                map.put(numbers[i], 1);
            }
            else {
                map.put(numbers[i], map.get(numbers[i]) + 1);
            }
        }
        int dup = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                dup = key;
                break;
            }
        }
        int minIndex = -1;
        int maxIndex = -1;
        for (int i = 0; i < numOfNumber; i++) {
            if (numbers[i] == dup) {
                if (minIndex >= 0) {
                    maxIndex = i;
                }
                else {
                    minIndex = i;
                }
            }
        }
        int d = maxIndex - minIndex - 1;
        int[][] dp = new int[numOfNumber + 1][(numOfNumber + 1) / 2 + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {

                if (j == 0 || i == j) {
                    dp[i][j] = 1;
                }
                else if (i > 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                    dp[i][j] %= 1000000007;
                }
            }
        }
        for (int k = 1; k <= numOfNumber; k++) {
            int cof1 = k > (numOfNumber + 1) / 2 ? dp[numOfNumber][numOfNumber - k] : dp[numOfNumber][k];
            int cof2 = numOfNumber - d - 2 >= 0 && k - 1 <= numOfNumber - d - 2 ? (k - 1 > (numOfNumber - d - 2 + 1) / 2 ? dp[numOfNumber - d - 2][numOfNumber - d - 2 - k + 1] : dp[numOfNumber - d - 2][k - 1]) : 0;
            System.out.println(cof1 - cof2);
        }
    }
}

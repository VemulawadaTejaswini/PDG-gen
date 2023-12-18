import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solve(arr, n - 1, 0));
    }

    public static int solve(int[][] arr, int day, int col) {

        String s = "" + day + col;
        if (map.containsKey(s)) {
            return map.get(s);
        }
        //base case
        if (day == 0) {
            return arr[day][col];
        }

        //recursive case
        int max = Integer.MIN_VALUE;
        int max0 = 0;
        int max1 = 0;
        int max2 = 0;
        int sol = 0;
        for (int j = 0; j < 3; j++) {
            sol = solve(arr, day - 1, j);
            map.putIfAbsent("" + (day - 1) + j, sol);

            if (j == 0) {
                max0 = sol + Math.max(arr[day][1], arr[day][2]);
            } else if (j == 1) {
                max1 = sol + Math.max(arr[day][0], arr[day][2]);
            } else if (j == 2) {
                max2 = sol + Math.max(arr[day][0], arr[day][1]);
            }
        }
        return Math.max(max0, Math.max(max1, max2));
    }
}
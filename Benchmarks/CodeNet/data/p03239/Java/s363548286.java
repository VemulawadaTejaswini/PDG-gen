import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        int[] costArr = new int[N];
        int[] timeArr = new int[N];
        for (int i = 0; i < N; i++) {
            costArr[i] = sc.nextInt();
            timeArr[i] = sc.nextInt();
        }

        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (timeArr[i] <= T) {
                minCost = Math.min(minCost, costArr[i]);
            }
        }

        if (minCost > 1000) {
            System.out.println("TLE");
        } else {
            System.out.println(minCost);
        }


        sc.close();
    }
}
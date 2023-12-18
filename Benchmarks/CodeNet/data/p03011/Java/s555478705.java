import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cost = new int[3];

        cost[0] = sc.nextInt();
        cost[1] = sc.nextInt();
        cost[2] = sc.nextInt();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 3; j++) {
                min = Math.min(min, cost[i] + cost[j]);
            }
        }

        System.out.println(min);
    }

}
import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] cost = new int[3];
        for (int i = 0; i <3; i++) {
            cost[i] = sc.nextInt();
        }
        Arrays.sort(cost);
        System.out.println(cost[0] + cost[1]);
    }
}
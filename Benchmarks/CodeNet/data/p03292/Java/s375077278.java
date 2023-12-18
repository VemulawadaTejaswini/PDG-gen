import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        int cost = 0;
        for (int i = 1; i < 3; i++) {
            cost += n[i] - n[i - 1];
        }
        System.out.println(cost);
    }
}

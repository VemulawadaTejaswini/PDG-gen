import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxDiff = Integer.MIN_VALUE;
        int min = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int r = sc.nextInt();
            maxDiff = Math.max(maxDiff, r - min);
            min = Math.min(min, r);
        }

        System.out.println(maxDiff);
    }
}

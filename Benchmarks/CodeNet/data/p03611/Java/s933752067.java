import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] list = new int[100001];

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            list[scanner.nextInt()]++;
        }

        int ans = 0;

        for (int i = 0; i <= 100000; i++) {
            int value = list[i];
            if (i > 0) {
                value += list[i - 1];
            }
            if (i < 100000) {
                value += list[i + 1];
            }

            ans = Math.max(ans, value);
        }

        System.out.println(ans);
    }
}
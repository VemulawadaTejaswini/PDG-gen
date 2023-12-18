import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] H = new int[N];

        for (int i = 0; i < N; i++) H[i] = sc.nextInt();

        int longest = 0;
        int current = 0;

        for (int i = 1; i < N; i++) {
            if (H[i] > H[i - 1]) {
                current = 0;
            } else {
                current++;
            }
            longest = Math.max(current, longest);
        }

        System.out.println(longest);
    }
}
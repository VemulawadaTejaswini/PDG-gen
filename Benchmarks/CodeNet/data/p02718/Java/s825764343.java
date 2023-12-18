import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int sum = 0;
        int[] votes = new int[N];
        for (int i = 0; i < N; i++) {
            int vote = scanner.nextInt();
            sum += vote;
            votes[i] = vote;
        }

        int counter = 0;
        for (int i = 0; i < N; i++) {
            if (votes[i] > sum / (4 * M)) {
                counter++;
            }
        }

        if (counter < M) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

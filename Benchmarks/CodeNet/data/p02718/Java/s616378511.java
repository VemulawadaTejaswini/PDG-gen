import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        int total = 0;
        for (int i=0; i < N; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        double line = (double)total / (double)(M * 4);

        int count = 0;
        for (int i=0; i< N; i++) {
            if (arr[i] >= line) {
                count++;
            }
        }

        if (count >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
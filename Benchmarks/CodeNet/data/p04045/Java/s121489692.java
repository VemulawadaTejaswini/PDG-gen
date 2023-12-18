import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        String[] dislikeNums = new String[K];

        for (int i = 0; i < K; i++) {
            dislikeNums[i] = scanner.next();
        }
        scanner.close();

        Loop: for (int i = N; i < 10000; i++) {
            String temp = String.valueOf(i);

            for (String st : dislikeNums) {
                if (temp.contains(st)) {
                    continue Loop;
                }
            }

            System.out.println(i);
            return;
        }
    }
}

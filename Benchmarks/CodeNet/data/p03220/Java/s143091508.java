import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int T = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());

        int ansDiff = Integer.MAX_VALUE;
        int ansIndex = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(scanner.next());
            int prefecture = T - (int) (h * 0.006);

            int diff = Math.abs(A - prefecture);
            if (diff < ansDiff) {
                ansDiff = diff;
                ansIndex = i;
            }
        }

        System.out.println(ansIndex + 1);

        scanner.close();
    }
}


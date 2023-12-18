import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int m = stdIn.nextInt();
        int scoreSum = 0;
        for (int i = 0; i < n - 1; i++) {
            scoreSum += stdIn.nextInt();
        }

        int aimScore = n * m - scoreSum;
        if (aimScore < 0) {
            System.out.println(0);
        } else if (aimScore > k) {
            System.out.println(-1);
        } else {
            System.out.println(aimScore);
        }
    }
}

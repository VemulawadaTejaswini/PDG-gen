import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int scoreA=0;
        int scoreB=0;

        int noGame = scan.nextInt();
        for (int i = 0; i < noGame; i++) {
            String a = scan.next();
            String b = scan.next();

            int result = a.compareTo(b);
            if (result == 0) {
                scoreA += 1;
                scoreB += 1;
            } else if (result > 0) {
                scoreA += 3;
            } else if (result < 0) {
                scoreB += 3;
            }
        }

        System.out.printf("%d %d\n", scoreA, scoreB);
    }
}
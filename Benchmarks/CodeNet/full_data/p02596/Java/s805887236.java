import java.util.Scanner;

public class Main {
    public int getFirstOccurrence(int k) {
        if (k % 2 == 0) return -1;

        int count = 1;
        int dividend = 7;
        while (true) {
            if (dividend % k == 0) return count;
            dividend = (dividend % k) * 10 + 7;
            count++;
        }
    }

    public static void main(String[] args) throws Exception {
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int answer = solution.getFirstOccurrence(k);
        System.out.println(answer);
    }
}
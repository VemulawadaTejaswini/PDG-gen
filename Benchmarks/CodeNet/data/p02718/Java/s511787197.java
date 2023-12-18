import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalVote = 0;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] votes = new int[n];
        for (int i = 0; i < n; i++) {
            votes[i] = scanner.nextInt();
            totalVote += votes[i];
        }

        int condition = totalVote / (4 * m);
        int count = 0;
        for (int vote : votes) {
            if (vote >= condition) {
                count++;
            }
        }

        if (count < m) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

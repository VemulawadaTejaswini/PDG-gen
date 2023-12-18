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

        if (isPopularVotesPossible(m, votes, condition)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static Boolean isPopularVotesPossible(int m, int[] votes, int condition) {
        if (votes.length == 0) {
            return false;
        }
        if (m==0) {
            return true;
        }

        int count = 0;
        for (int vote : votes) {
            if (vote >= condition) {
                count++;
            }
        }
        return count >= m;
    }
}

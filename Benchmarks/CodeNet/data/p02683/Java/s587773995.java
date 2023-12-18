import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int[] amount = new int[n];
        int[][] effect = new int[n][m];
        int[] goal = new int[m];

        for (int i = 0; i < n; i++) {
            amount[i] = sc.nextInt();
            for (int j = 0; j < m; j++) {
                effect[i][j] = sc.nextInt();
            }
        }

        int answerN; // 何冊買えば達成できるかの答え
        int[] answerBook; // 何番目の本を買えば達成できるかの答え
        boolean endFlag = false; // 答えが出たかどうか

        for (int ni = 0; ni < n; ni++) {
            answerN = ni;
            answerBook = getAnswerBook(ni, n);
            for (int i = 0; i < answerN; i++) {
                for (int j = 0; j < answerBook.length; j++) {
                    for (int k = 0; k < n; k++) {
                        if (k == answerBook[j]) {
                            goal[i] += effect[i][k];
                        }
                    }
                }
                if (goal[i] < x) {
                    System.out.println(-1);
                    endFlag = true;
                }
                if (endFlag)
                    break;
            }
            if (endFlag)
                break;
        }
    }

    static int[] getAnswerBook(int ni, int n) {
        int[] returnAnswerBook = new int[ni];
        if (ni == n) {
            for (int i = 0; i < returnAnswerBook.length; i++) {
                returnAnswerBook[i] = n;
            }
        }
        return returnAnswerBook;
    }
}
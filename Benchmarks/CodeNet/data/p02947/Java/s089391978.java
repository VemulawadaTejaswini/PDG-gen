import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] sortedWords = new String[N];
        for (int i = 0; i < N; i++) {
            String word = sc.next();
            char[] tmp = word.toCharArray();
            Arrays.sort(tmp);
            String sortedWord = String.valueOf(tmp);
            sortedWords[i] = sortedWord;
        }

        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (sortedWords[i].equals(sortedWords[j])) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}
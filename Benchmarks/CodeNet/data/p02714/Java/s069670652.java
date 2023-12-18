
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] S = scanner.next().toCharArray();

        int count = 0;
        for (int i = 1 ; i <= N - 2; i++) {
            int j = i+1;
            int k = j+1;
            while (k <= N) {
                char Si = S[i - 1];
                char Sj = S[j - 1];
                char Sk = S[k - 1];

                if (j - i == k - j) {

                    if (j < k - 1) {
                        j++;
                    } else {
                        k++;
                        j = i+1;
                    }
                    continue;
                }

                if (check1(Si, Sj, Sk)) {
                    count++;
                }

                if (j < k - 1) {
                    j++;
                } else {
                    k++;
                    j = i+1;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean check1(char Si, char Sj, char Sk) {
        if (Si == Sj) return false;
        if (Si == Sk) return false;
        if (Sj == Sk) return false;
        return true;
    }

    private static boolean check2(int i, int j, int k) {
        return j - i != k - j;
    }

}

import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        char[] SCharArray = S.toCharArray();
        int[] leftPos = new int[Q];
        int[] rightPos = new int[Q];
        for (int i = 0; i < Q; i++) {
            leftPos[i] = sc.nextInt();
            rightPos[i] = sc.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int leftSuffix = leftPos[i] - 1;
            int rightSuffix = rightPos[i] - 1;
            int cnt = 0;
            for (int j = leftSuffix; j < rightSuffix; j++) {
                if (SCharArray[j] == 'A') {
                    if (SCharArray[j+1] == 'C') {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}

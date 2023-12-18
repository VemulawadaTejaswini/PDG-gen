import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int[] children;

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        char[] LR = S.toCharArray();
        children = new int[N];
        Arrays.fill(children, 0);

        int start = 0; // RLブロックの左端
        int end = 0; // RLブロックの右端
        for (int i = 0; i <= N - 2; i++) {
            if (LR[i] == 'R' && LR[i + 1] == 'L') {
                for (int j = i + 1; j <= N - 1; j++) {
                    if (j == N - 1) {
                        end = j;
                        //start = i;
                        break;
                    }
                    if (LR[j] == 'R') {
                        end = j - 1;
                        // i = end;
                        break;
                    }
                }
                countChildren(i, start, end); // i は R の場所。
                i = end;
                start = end + 1;
                end = start; // 不要だが、start > end の状態は不自然なので、ここで是正しておく。
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(children[i] + " ");
        }

    }
    void countChildren(int rPos, int start, int end) {
        int lPos = rPos + 1;
        int rPosChildrenNum = (rPos - start) / 2 + (end - rPos) / 2 + 1;
        int lPosChildrenNum = (lPos - start) / 2 + (end - lPos) / 2 + 1;
        children[rPos] = rPosChildrenNum;
        children[lPos] = lPosChildrenNum;
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}


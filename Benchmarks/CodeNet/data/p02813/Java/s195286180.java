
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static int P;
    static int Q;
    static int pPos;
    static int qPos;
    static int perpeturation;
    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        P = 0;
        Q = 0;
        pPos = 0;
        qPos = 0;
        perpeturation = 0;
        for(int i = 0; i < N; i++) {
            int tmp = scan.nextInt();
            P += tmp*Math.pow(10, N-1-i);
        }
        for(int i = 0; i < N; i++) {
            int tmp = scan.nextInt();
            Q += tmp*Math.pow(10, N-1-i);
        }

        boolean isUsed[] = new boolean[N];
        dfs(N, N, isUsed, 0);

        os.println(Math.abs(pPos-qPos));
    }

    public static void dfs(int N, int leftTimes, boolean isUsed[], int sum) {
        for(int i = 0; i < N; i++) {
            if(!isUsed[i]){
                int tmp = 10*sum + i+1;
                if(leftTimes == 1){
                    perpeturation++;
                    if(tmp == P)
                        pPos = perpeturation;
                    if(tmp == Q)
                        qPos = perpeturation;
                    return;
                }
                isUsed[i] = true;
                dfs(N, leftTimes-1, isUsed, tmp);
                isUsed[i] = false;
            }
        }
    }
}
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void resetAvailable(int[] available) {
        Arrays.fill(available, 1);
    }

    static boolean isAllAvailable(int[] available, int N) {
        for(int i = 0; i < N; i++) {
            if (available[i] == 0)
                return false;
        }
        return true;
    }

    static boolean isAllDone(int pos[], int N) {
        for (int i = 0; i < N; i++) {
            if(pos[i] < N-1)
                return false;
        }
        return true;
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int available[] = new int[N];//使用可能なら1.　不可なら0
        int pos[] = new int[N];//全部完了したらN-1 N-1にはアクセス不可
        int value [][] = new int[N][N-1];
        resetAvailable(available);
        for(int i = 0; i < N; i++) {
            pos[i] = 0;
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - 1; j++) {
                value[i][j] = scan.nextInt() - 1;
            }
        }

        int answer = 0;
        boolean is_match_exist = false;
        Set searchIndex = new HashSet();
        while(!isAllDone(pos, N)) {
            if(!is_match_exist) {
                for (int i = 0; i < N; i++) {
                    if (available[i] == 0 || pos[i] == N - 1)
                        continue;

                    int enemy = value[i][pos[i]];
                    if (value[enemy][pos[enemy]] == i && available[enemy] == 1) {
                        available[i] = 0;
                        available[enemy] = 0;
                        pos[i] += 1;
                        pos[enemy] += 1;
                        searchIndex.add(i);
                        searchIndex.add(enemy);
                    }
                }
            } else {
                Set tempSearchIndex = new HashSet();
                searchIndex.forEach(tempi -> {
                    int i = (int)tempi;
                    if (available[i] == 0 || pos[i] == N - 1)
                        return;

                    int enemy = value[i][pos[i]];
                    if (value[enemy][pos[enemy]] == i && available[enemy] == 1) {
                        available[i] = 0;
                        available[enemy] = 0;
                        pos[i] += 1;
                        pos[enemy] += 1;
                        tempSearchIndex.add(i);
                        tempSearchIndex.add(enemy);
                    }
                });
                searchIndex = new HashSet(tempSearchIndex);
            }
            if (isAllAvailable(available, N)) {
                os.println("-1");
                return;
            } else {
                answer++;
                is_match_exist = true;
                resetAvailable(available);
            }
        }
        os.println(answer);
    }
}
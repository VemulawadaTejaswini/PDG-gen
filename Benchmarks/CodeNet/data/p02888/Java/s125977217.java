import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        Integer L[] = new Integer[N];
        for(int i = 0; i < N ; i++) {
            L[i] = scan.nextInt();
        }
        Arrays.sort(L, Comparator.reverseOrder());

        long answer = 0;
        for(int a = 0; a < N ; a++) {
            for(int b = a+1; b < N ; b++) {
                for(int c = b+1; c < N ; c++) {
                    if(L[b] + L[c] <= L[a])
                        break;
                    if(L[a] + L[b] > L[c] &&  L[a] + L[c] > L[b])
                        answer++;
                }

            }
        }

        os.println(answer);

    }
}
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
        int M = scan.nextInt();
        Integer A[] = new Integer[N];
        for(int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        Arrays.sort(A, Collections.reverseOrder());
        for(int i = 0; i < M; i++) {
            A[0] = new Double(Math.floor(A[0].doubleValue() / 2.0)).intValue();
            for(int j = 0; j < N - 1; j++) {
                if(A[j] < A[j+1]) {
                    Integer temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                } else {
                    break;
                }
            }
        }

        long sum = 0;
        for(int i = 0; i < N; i++) {
            sum += A[i];
        }
        os.println(sum);
    }
}
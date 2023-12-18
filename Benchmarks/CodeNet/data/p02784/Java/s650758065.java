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
        long H = scan.nextLong();
        int N = scan.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++)
            A[i] = scan.nextInt();

        Arrays.sort(A);
        for(int i = N-1; i >= 0; i--){
            H -= A[i];
            if(H <= 0) break;
        }

        if(H <= 0)
            os.println("Yes");
        else
            os.println("No");
    }
}
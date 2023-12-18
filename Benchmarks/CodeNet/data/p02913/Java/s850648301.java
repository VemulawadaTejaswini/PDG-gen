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
        String string = scan.next();
        char S[] = string.toCharArray();
        int A[] = new int[N];
        A[0] = string.length();
        int max = 0;
        int i = 1;//位置
        int j = 0;//半径
        int offset =0;
        while(i < string.length()) {
            int previ = i;
            offset = i - 1;
            while (i < string.length()) {
                while (offset + j < i  && i + j < string.length() && S[offset + j] == S[i + j]) j++;
                A[i - offset] = j;
                if (max < j) {
                    max = j;
                }
                if (j == 0) {
                    i++;
                    continue;
                }
                int k = 1;
                while (k + A[k] < j) {
                    A[i - offset + k] = A[k];
                    k++;
                }
                i += k;
                j -= k;
            }
            i = ++previ;
        }

        os.println(max);
    }
}
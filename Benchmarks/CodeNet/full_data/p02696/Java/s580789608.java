
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long x = Math.min(B-1, N);

        os.println((long)(Math.floor(A*x/(double)B)-A*Math.floor(x/(double)B)));
    }
}
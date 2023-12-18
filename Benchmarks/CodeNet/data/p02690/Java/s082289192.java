
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
        long X = sc.nextLong();

        for(int A = 0; A <= 100; A++) {
            for(int B = -100; B <= 100; B++) {
                if((A*A*A*A*A)-(B*B*B*B*B) == X){
                    os.println(A + " " + B);
                    return;
                }
            }
        }
    }
}
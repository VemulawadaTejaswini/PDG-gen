
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

        for(long A = -200; A <= 200; A++) {
            for(long B = -200; B <= 200; B++) {
                if(A*A*A*A*A == X + B*B*B*B*B){
                    os.println(A + " " + B);
                    return;
                }
            }
        }
    }
}
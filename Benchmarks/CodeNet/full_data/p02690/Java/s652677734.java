
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

        for(long A = 0; A <= 100; A++) {
            for(long B = -100; B <= 100; B++) {
                if(Math.pow(A,5)-Math.pow(B,5) == X){
                    os.println(A + " " + B);
                    return;
                }
            }
        }
    }
}
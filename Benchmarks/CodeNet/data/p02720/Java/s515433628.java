
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
        int K = sc.nextInt();

        Queue<Long> q = new PriorityQueue<>();

        for(long i = 1; i < 10; i++)
            q.offer(i);

        int count = 0;

        while(count++ < K-1) {
            long num = q.poll();

            if(num % 10 != 0) {
                q.offer(num*10 + num%10-1);
            }

            q.offer(num*10 + num%10);

            if(num % 10 != 9){
                q.offer(num*10 + num%10+1);
            }
        }

        os.println(q.poll());
    }
}
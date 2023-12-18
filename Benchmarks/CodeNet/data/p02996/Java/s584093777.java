import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        int n = ni();
        Task[] tasks = new Task[n];
        for (int i = 0; i < n; i++) {
            tasks[i] = new Task(ni(), ni());
        }
        Arrays.sort(tasks);
        int time = 0;
        for (int i = 0; i < n; i++) {
            time += tasks[i].cost;
            if (time > tasks[i].due) {
                so.println("No");
                return;
            }
        }
        so.println("Yes");
    }
    
    static class Task implements Comparable<Task>{
        public int cost;
        public int due;
        public Task(int cost, int due) {
            this.cost = cost;
            this.due = due;
        }
        @Override
        public int compareTo(Task that) {
            return this.due - that.due;
        }
        
        @Override
        public String toString() {
            return "cost: " + cost + ", due: " + due;
        }
    }
    
    
    static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    
    static long lcm(int m, int n) {
        return (long) m * (long) n / gcd(m, n);
    }

    private static long nl() {
        return sc.nextLong();
    }

    private static int ni() {
        return sc.nextInt();
    }

    private static String ns() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0);
    }

    private static long[] nlongs(int n, int offset) {
        long[] a = new long[offset + n];
        for (int i = 0; i < n; i++)
            a[offset + i] = nl();
        return a;
    }
}

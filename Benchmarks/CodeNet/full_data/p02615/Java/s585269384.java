import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int n = 0;
    static long[] ai = null;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ai = new long[n];
        for(int i=0; i<n; i++) {
            ai[i] = in.nextLong();
        }
        Arrays.sort(ai);
        PriorityQueue<ABC173DTuple> queue = new PriorityQueue<>(n);
        long ans = 0;
        ABC173DTuple firstTuple = new ABC173DTuple();
        firstTuple.a = ai[n-1];
        firstTuple.b = ai[n-1];
        queue.add(firstTuple);
        for(int i=n-2; i>=0; i--) {
            long nextVal = ai[i];
            ABC173DTuple toBeDecoupled = queue.poll();
            ans += toBeDecoupled.score();
            ABC173DTuple nextT1 = new ABC173DTuple();
            nextT1.a = toBeDecoupled.a;
            nextT1.b = nextVal;
            queue.add(nextT1);
            ABC173DTuple nextT2 = new ABC173DTuple();
            nextT2.a = toBeDecoupled.b;
            nextT2.b = nextVal;
            queue.add(nextT2);
        }
        System.out.println(ans);
    }
}
class ABC173DTuple implements Comparable<ABC173DTuple> {
    long a;
    long b;
    public long score() {
        return Math.min(this.a, this.b);
    }
    
    @Override
    public int compareTo(ABC173DTuple o) {
        long diff = this.score() - o.score();
        return (diff>0 ? 1 : (diff<0 ? -1 : 0));
    }
}
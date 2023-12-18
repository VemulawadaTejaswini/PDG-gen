
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        ArrayList<Integer> aValueList = new ArrayList();
        ArrayList<Integer> bValueList = new ArrayList();
        ArrayList<Integer> cValueList = new ArrayList();
        for(int i = 0 ; i < A; i++) {
            aValueList.add(scan.nextInt());
        }
        for(int i = 0 ; i < B; i++) {
            bValueList.add(scan.nextInt());
        }
        for(int i = 0 ; i < C; i++) {
            cValueList.add(scan.nextInt());
        }

        Collections.sort(aValueList, Collections.reverseOrder());
        Collections.sort(bValueList, Collections.reverseOrder());
        Collections.sort(cValueList, Collections.reverseOrder());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < X; i++) {
            pq.offer(aValueList.get(i));
        }
        for(int i = 0 ; i < Y; i++) {
            pq.offer(bValueList.get(i));
        }
        pq.addAll(cValueList);

        long ans = 0;
        for(int i = 0; i < X+Y; i++) {
            ans += pq.poll();
        }

        os.println(ans);

    }
}
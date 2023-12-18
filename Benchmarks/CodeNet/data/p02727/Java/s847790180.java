
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static class Value {
        int type;
        int value;
        Value(int type, int value) {
            this.type = type;
            this.value = value;
        }

        public int getType() {
            return type;
        }

        public int getValue() {
            return value;
        }
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        PriorityQueue<Value> pq = new PriorityQueue<>(Comparator.comparing(Value::getValue).reversed());

        for(int i = 0 ; i < A; i++) {
            pq.offer(new Value(0, scan.nextInt()));
        }
        for(int i = 0 ; i < B; i++) {
            pq.offer(new Value(1, scan.nextInt()));
        }
        for(int i = 0 ; i < C; i++) {
            pq.offer(new Value(2, scan.nextInt()));
        }

        long ans = 0;
        long ac = 0;
        long bc = 0;
        long cc = 0;
        for(; ac+bc+cc < X+Y;) {
            Value v = pq.poll();
            switch (v.getType()) {
                case 0:
                    if(ac < X){
                        ans += v.getValue();
                        ac++;
                    }
                    break;

                case 1:
                    if(bc < Y){
                        ans += v.getValue();
                        bc++;
                    }
                    break;

                case 2:
                    ans += v.getValue();
                    cc++;
                    break;
            }
        }

        os.println(ans);

    }

}
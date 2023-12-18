import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;


/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(1, in, out);
        out.close();
    }

    static class Solver {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();

            Solver.Tuple[] operations = new Tuple[2*m];

            for (int i = 0; i < m; i++) {
                int a = in.nextInt(), b = in.nextInt();
                operations[i*2] = new Solver.Tuple(a,1,i);
                operations[i*2+1] = new Solver.Tuple(b,0,i);
            }
            Arrays.sort(operations, new NumberComparator());

            int res = 0;
            boolean[] deleted = new boolean[100001];
            int left = 0;
            for (int i = 0; i < 2*m; i++) {
                
                if (operations[i].type==1) {
                    
                }
                else if(deleted[operations[i].i]==false){
        
                    ++res;
                    for (; left <= i; left++) {
                        if(operations[left].type == 1){
                            deleted[operations[left].i] = true;
                        }
                    }
                }
            }

            System.out.println(res);
        }
        private static class Tuple {
            int pos;
            int type;//0は終点、1は始点
            int i;

            private Tuple(int pos, int type, int i) {
                this.pos = pos;
                this.type = type;
                this.i = i;
            }

        }

        public class NumberComparator implements Comparator<Tuple> {
            public int compare (Tuple l, Tuple r) {
                if(l.pos == r.pos){
                    if(l.type == r.type){
                        return 0;
                    }
                    return l.type - r.type;
                }
                return l.pos - r.pos;
            }
        }

    }
}


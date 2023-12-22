import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.AbstractQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HussienMoustafa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTsundoku solver = new CTsundoku();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTsundoku {
        public void solve(int testNumber, Scanner s, PrintWriter out) {
            LinkedList<Integer> a = new LinkedList<>();
            LinkedList<Integer> b = new LinkedList<>();
            int n1 = s.nextInt(), n2 = s.nextInt(), total = s.nextInt(), cnt = 0, n = n1 + n2;
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            while (n-- != 0) {
                pq.add(s.nextInt());
            }
            while (true) {
                if (!pq.isEmpty()) {
                    if (total - pq.peek() >= 0) {
                        total -= pq.remove();
                        cnt++;
                    } else {
                        out.println(cnt);
                        break;
                    }
                } else {
                    out.println(cnt);
                    break;
                }

            }
        
        /*while(n1--!=0){
            a.add(s.nextInt());
        }

        while (n2--!=0){
            b.add(s.nextInt());
        }
        
        
        while(true){

            if(!a.isEmpty()){
                if(!b.isEmpty()){
                    if(a.getFirst()<=b.getFirst() && total-a.getFirst()>=0){
                        total-=a.removeFirst();
                        cnt++;
                    }
                    else if(a.getFirst()>b.getFirst() && total-b.getFirst()>=0){
                        total-=b.removeFirst();
                        cnt++;
                    }
                    else {
                        out.println(cnt);
                        break;
                    }
                }
                else if(total-a.getFirst()>=0){
                    total-=a.removeFirst();
                    cnt++;
                }
                else {
                    out.println(cnt);
                    break;
                }
            }

            else if(!b.isEmpty() && total-b.getFirst()>=0){
                total-=b.removeFirst();
                cnt++;
            }

            else {
                out.println(cnt);
                break;
            }
        }*/
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


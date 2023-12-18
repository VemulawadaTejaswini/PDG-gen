import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st;
                PrintWriter pw = new PrintWriter(System.out);

                st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                Integer[] a = new Integer[n];
                st = new StringTokenizer(br.readLine());
                for(int i=0 ; i<n ; i++) {
                        a[i] = Integer.parseInt(st.nextToken());
                }
                Arrays.sort(a, Collections.reverseOrder());

                int count = p;
                long accum = 0;
                long space = (long)(v-(p-1)) * m;
                for(int i=p ; i<n ; i++) {
                        accum += a[p-1] - a[i];
                }
                for(int i=p ; i<n ; i++) {
                        long cons = accum - (a[p-1] - a[i]) + (long)(n-p-1)*(a[i]+m-a[p-1]);
                        if(a[i]+m >= a[p-1] && cons >= space) {
                                count++;
                        }
                }

                pw.println(count);


                pw.flush();
                pw.close();
        }
}

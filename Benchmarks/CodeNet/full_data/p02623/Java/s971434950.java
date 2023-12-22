import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            long[] a = new long[n];
            for(int i=0 ; i<n ; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            long[] b = new long[m];
            for(int i=0 ; i<m ; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=1 ; i<n ; i++) {
                a[i] += a[i-1];
            }
            for(int i=1 ; i<m ; i++) {
                b[i] += b[i-1];
            }

            int max = 0;
            for(int i=0 ; i<n ; i++) {
                long rem = k - a[i];
                if(rem >= 0) {
                    int l = 0;
                    int r = m-1;
                    int ans = -1;
                    while(l<=r) {
                        int mid = (l+r)/2;
                        if(b[mid] <= rem) {
                            ans = mid;
                            l = mid+1;
                        }
                        else {
                            r = mid-1;
                        }
                    }
                    max = Math.max(max, (i+1) + (ans+1));
                }
            }

            for(int i=0 ; i<m ; i++) {
                if(b[i] <= k) {
                    max = Math.max(max, (i+1));
                }
            }

            pw.println(max);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}

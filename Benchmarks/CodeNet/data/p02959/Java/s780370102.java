import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st;
                int n = Integer.parseInt(br.readLine());
                st = new StringTokenizer(br.readLine());
                int a[] = new int[n+1];
                for(int i=0 ; i<n+1 ; i++) {
                        a[i] = Integer.parseInt(st.nextToken());
                }

                st = new StringTokenizer(br.readLine());
                int b[] = new int[n];
                long count = 0;
                for(int i=0 ; i<n ; i++) {
                        b[i] = Integer.parseInt(st.nextToken());
                        if(a[i] >= b[i]) {
                                count += b[i];
                                a[i] -= b[i];
                                b[i] = 0;
                        }
                        else {
                                b[i] -= a[i];
                                count += a[i];
                                a[i] = 0;
                                if(a[i+1] >= b[i]) {
                                        count += b[i];
                                        a[i+1] -= b[i];
                                        b[i] = 0;
                                }
                                else {
                                        b[i] -= a[i+1];
                                        count += a[i+1];
                                        a[i+1] = 0;
                                }
                        }
                }

                System.out.println(count);
        }
}

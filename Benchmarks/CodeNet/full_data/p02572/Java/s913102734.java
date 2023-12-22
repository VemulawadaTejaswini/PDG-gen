import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static double mod=  (1e9+7);
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int N=fs.nextInt();
        double[] arr=fs.readArray(N);
        double sum=0;
        for(int i=0;i<arr.length-1;i++ ){
            for(int j=i+1;j< arr.length;j++){
                sum+=((arr[i]*arr[j])%mod);
                sum=  (sum%mod);
            }
        }

        System.out.println((long)(sum%mod));
    }
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        double[] readArray(int n) {
            double[] a=new double[n];
            for (int i=0; i<n; i++) a[i]=(double) nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

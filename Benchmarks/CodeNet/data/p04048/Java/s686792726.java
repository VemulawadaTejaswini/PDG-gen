import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class New4 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] a = la(in.readLine(), 2);
        long N=a[0], X=a[1];
        long sum=N;
        int flag=0;
        while (flag==0) {
            long k=(N-X)/X;
            if ((N-X)%X==0) {
                sum+=((2*k+1)*X);
                flag=1;
            }
            else {
                sum+=(2*k*X);
                long temp=X;
                X = (N-X)%X;
                N=temp;
            }
        }
        out.write(sum+"\n");
        out.flush();
    }
    
    private static int ip (String s) {
        int n = Integer.parseInt(s);
        return n;
    }
    
    private static long lp (String s) {
        long n = Long.parseLong(s);
        return n;
    }
    
    private static double dp (String s) {
        double n = Double.parseDouble(s);
        return n;
    }
    
    private static int[] ia (String s, int n) {
        String[] s1 = s.split(" ");
        int[] A = new int[n];
        for (int i=0; i<n; i++) {
            A[i] = Integer.parseInt(s1[i]);
        }
        return A;
    }
    
    private static long[] la (String s, int n) {
        String[] s1 = s.split(" ");
        long[] A = new long[n];
        for (int i=0; i<n; i++) {
            A[i] = Long.parseLong(s1[i]);
        }
        return A;
    }
    
    private static double[] da (String s, int n) {
        String[] s1 = s.split(" ");
        double[] A = new double[n];
        for (int i=0; i<n; i++) {
            A[i] = Double.parseDouble(s1[i]);
        }
        return A;
    }

}
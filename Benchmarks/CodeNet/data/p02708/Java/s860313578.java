import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader(System.in);
        StringBuilder sb = new StringBuilder();
        int i,j;
        int n=in.nextInt();
        int k=in.nextInt();
        long ans=0,mod=1000_000_007;
        long arr[]=new long[n+1];
        for(i=0;i<=n;i++) {
            arr[i] = i;
            if(i!=0)
                arr[i]=(arr[i]+arr[i-1])%mod;
        }
        for(i=k-1;i<=n;i++){
            long a=arr[i];
            long b=(arr[n]-arr[Math.max(0,n-(i+1))]+mod)%mod;
            //System.out.println(a+" "+b);
            ans=(ans+(b-a+1+mod))%mod;
        }
        System.out.println(ans);
    }
}
class FastReader {

    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;

    FastReader(InputStream is) {
        in = is;
    }

    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }

    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan());
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }
    String nextLine() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan());
        StringBuilder sb = new StringBuilder();
        for (; c !=10 && c!=13; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }
    char nextChar() throws IOException{
        int c;
        for (c = scan(); c <= 32; c = scan());
        return (char)c;
    }

    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan());
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }

    long nextLong() throws IOException {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan());
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
}

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;

public class Main {
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args)throws Exception {
        FastReader in = new FastReader(System.in);
        StringBuilder sb = new StringBuilder();
        int i,j;
        int n=in.nextInt();
        char arr[]=in.next().toCharArray();

        int pre[][]=new int[n+1][3];
        pre[n][0]=pre[n][1]=pre[n][2]=0;
        int val[]=new int[n];
        for(i=0;i<n;i++){
            if(arr[i]=='R')
                val[i]=0;
            else if(arr[i]=='G')
                val[i]=1;
            else
                val[i]=2;
        }
        for(i=n-1;i>=0;i--){
            for(j=0;j<3;j++) {
                pre[i][j] = pre[i + 1][j];
                if (val[i]==j)
                    pre[i][j]++;
            }
        }
        long ans=0;
        for(i=0;i<n-2;i++){
            for(j=i+1;j<n-1;j++){
                if(val[i]!=val[j]){
                    int z=3-(val[i]+val[j]);
                    ans+=pre[j+1][z];
                    if(2*j-i<n && val[2*j-i]==z)
                        ans--;
                }
            }
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
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }

    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
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
        for (c = scan(); c <= 32; c = scan()) ;
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




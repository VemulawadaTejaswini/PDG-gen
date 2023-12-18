import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;

public class Main {
    static long dp[][];
    static long arr[];
    static long recurse(int idx,int want){
        //System.out.println(idx+" "+want);
        if(want==0)
            return 0;
        if(idx<0)
            return Long.MIN_VALUE/100;
        if(want>idx)
            return Long.MIN_VALUE/100;
        int z=want%2;
        if(dp[idx][z]!=-1)
            return dp[idx][z];
        dp[idx][z]=Long.MIN_VALUE/100;
        if(idx%2==0){
            if(want*2==idx)
                dp[idx][z]=Math.max(arr[idx]+recurse(idx-2,want-1),
                    arr[idx-1]+recurse(idx-3,want-1));
        }
        else{
            if(want*2+1==idx){
                dp[idx][z]=Math.max(arr[idx]+recurse(idx-2,want-1),
                        arr[idx-1]+recurse(idx-3,want));
                dp[idx][z]=Math.max(dp[idx][z],recurse(idx-1,want));
            }
            else{
                dp[idx][z]=arr[idx]+recurse(idx-2,want-1);
            }
        }
        //System.out.println(idx+" "+want+" "+dp[idx][z]);
        return dp[idx][z];
    }
    public static void main(String[] args)throws Exception {
        FastReader in = new FastReader(System.in);
        StringBuilder sb = new StringBuilder();
        int i,j;
        int n=in.nextInt();
        arr=new long[n+1];
        dp=new long[n+1][2];
        for(i=1;i<=n;i++){
            dp[i][0]=dp[i][1]=-1;
        }
        for(i=1;i<=n;i++){
            arr[i]=in.nextInt();
        }

        recurse(n,n/2);
        int want=n/2;
        int z=want%2;
        /*for(i=1;i<=n;i++){
            System.out.println(i+"->"+dp[i][0]+" "+dp[i][1]);
        }*/
        System.out.println(dp[n][z]);

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




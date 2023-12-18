import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    static int n;
    static long val[];
    static long max=0;
    static void permute(long[] arr, int i, int n) {
        int j;
        if (i == n) {
            //System.out.println(Arrays.toString(arr));
            calc(arr);
        }
        else {
            for (j = i; j <= n; j++) {
                //swap(arr, i, j);
                long t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                permute(arr, i + 1, n);
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                //swap(arr, i, j); // backtrack
            }
        }
    }
    public static void calc(long arr[]){
        long ans=0;
        for(int i=0;i<n;i++){
            ans=(ans+Math.abs(arr[i]-i)*val[i]);
        }
        if(ans>max){
            max=ans;
            System.out.println(Arrays.toString(arr)+"->"+ans);
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader(System.in);
        StringBuilder sb = new StringBuilder();
        int i,j;
        n=in.nextInt();
        val=new long[n];
        max=0;
        for(i=0;i<n;i++)
            val[i]=in.nextInt();
        long pos[]=new long[n];
        for(i=0;i<n;i++)
            pos[i]=i;
        //permute(pos,0,n-1);
        long st[][]=new long[n][2];
        HashSet<Integer> set=new HashSet<>();
        int l=0,r=n-1;
        long ans=0;
        for(i=0;i<n;i++) {
            for (j = 0; j < n; j++) {
                st[j][0] = val[j] * Math.max((j-l), (r - j));
                if(j-l>r-j)
                    st[j][1]=0;
                else
                    st[j][1]=1;
            }
            long max=-1;
            int po=-1;
            for(j=0;j<n;j++){
                if(!set.contains(j)){
                    if(st[j][0]>max){
                        max=st[j][0];
                        po=j;
                    }
                }
            }
            ans=ans+max;
            //System.out.println(max+" "+po);
            if(st[po][1]==0)
                l++;
            else
                r--;
            set.add(po);

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

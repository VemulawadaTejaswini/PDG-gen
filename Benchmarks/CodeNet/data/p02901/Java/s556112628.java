import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <=0){
                return false;
            }
        }
        return true;
    }

    private int readByte(){
        if(hasNextByte())return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c){
        return 33<=c && c<=126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;
        return hasNextByte();
    }

    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b<='9'){
                n*=10;
                n+=b-'0';
            }else if(b==-1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt(){
        long nl = nextLong();
        if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDoutble(){return Double.parseDouble(next());}
}
public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();
        int[] a = new int[m];
        int b;
        int[] keys = new int[m];
        int c;
        for(int i=0;i<m;i++){
            a[i]= fs.nextInt();
            b= fs.nextInt();
            int keybit = 0;
            for(int j=0;j<b;j++){
                c = fs.nextInt();
                keybit|=(1<<(c-1));
            }
            keys[i] = keybit;
        }
        int inf = 1000000000;
        int[][] dp = new int[m+1][(1<<n)];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<(1<<n);j++){
                dp[i][j] = inf;
            }
        }
        dp[0][0] = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<(1<<n);j++){
                dp[i+1][j] = Math.min(dp[i+1][j],dp[i][j]);//鍵iを使わない場合
                dp[i+1][j|keys[i]] = Math.min(dp[i+1][j|keys[i]], dp[i][j]+a[i]);//鍵iを使う場合
            }
        }


        if(dp[m][(1<<n)-1]<inf){
            System.out.println(dp[m][(1<<n)-1]);
        }else{
            System.out.println(-1);
        }
    }
    
}
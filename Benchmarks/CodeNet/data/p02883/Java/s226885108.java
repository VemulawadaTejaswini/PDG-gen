
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
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
    static int n;
    static long k;
    static int[] a,f;
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        n = fs.nextInt();
        k = fs.nextLong();
        a = new int[n];
        f = new int[n];
        for(int i=0;i<n;i++)a[i] = fs.nextInt();

        for(int i=0;i<n;i++)f[i] = -fs.nextInt();
        Arrays.sort(a);
        Arrays.sort(f);
        long ng = -1;
        long ok = 10000000;
        while(ok-ng>1){
            long mid = (ok-ng)/2+ng;
            if(isOk(mid)){
                ok = mid;
            }else{
                ng = mid;
            }
        }
        System.out.println(ok);
    }

    public static boolean isOk(long val){
        long training = 0;
        long require;
        for(int i=0;i<n;i++){
            require = val/(-f[i]);
            training+=Math.max(0,a[i]-require);
        }

        return training<=k;
    }
}
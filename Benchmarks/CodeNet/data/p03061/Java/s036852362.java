import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
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
class GCD {
    //xとyの最大公約数をお止める
    public static long getGCD(long a,long b){
        if(b==0){
            return a;
        }else{
            return getGCD(b,a%b);
        }
    }

    public static long extGCD(long a,long b,Pair pair){
        if(b==0){
            pair.x = 1;
            pair.y = 0;
            return a;
        }else{
            long d = extGCD(b,a%b,pair);
            long tmp = pair.x;
            pair.x = pair.y;
            pair.y = tmp - a/b*pair.y;
            return d;
        }
    }
    public class Pair{
        long x;
        long y;
        Pair(long x,long y){
            this.x = x;
            this.y = y;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = fs.nextInt();
        int[] lgcd = new int[n+1];
        int[] rgcd = new int[n+1];
        
        for(int i=0;i<n;i++){
            lgcd[i+1] = (int)GCD.getGCD(lgcd[i], a[i]);
            rgcd[n-i-1] = (int)GCD.getGCD(rgcd[n-i],a[n-i-1]);
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max = (int)Math.max(max,GCD.getGCD(lgcd[i],rgcd[i+1]));
        }
        System.out.println(max);
    }
}

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
        int x = fs.nextInt();
        int y = fs.nextInt();
        int z = fs.nextInt();
        int k = fs.nextInt();
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        for(int i=0;i<x;i++)a[i] = -fs.nextLong();
        for(int i=0;i<y;i++)b[i] = -fs.nextLong();
        for(int i=0;i<z;i++)c[i] = -fs.nextLong();

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        List<Long> list = new ArrayList<>();
        for(int i=0;i<x;i++){
            if(i+1 > k)break;
            for(int j=0;j<y;j++){
                if((i+1)*(j+1) > k)break;
                for(int l=0;l<z;l++){
                    if((i+1)*(j+1)*(l+1) > k)break;
                    else{
                        list.add(-a[i]-b[j]-c[l]);
                    }
                }
            }
        }
        Collections.sort(list);
        int n = list.size();
        PrintWriter writer = new PrintWriter(System.out);
        for(int i=0;i<k;i++){
            writer.println(list.get(n-1-i));
        }
        writer.flush();


    }
    
}
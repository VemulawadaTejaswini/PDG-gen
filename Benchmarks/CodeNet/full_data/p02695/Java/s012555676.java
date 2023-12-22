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
    static int n,m,q;
    static ABCD[] array;
    static int max;
    static int[] A;
    public static void main(String[] args) {
       
        FastScanner fs = new FastScanner();
        n = fs.nextInt();
        m = fs.nextInt();
        q = fs.nextInt();
        array = new ABCD[q];
        max = 0;
        A = new int[n];
        for(int i=0;i<q;i++){
            array[i] = new ABCD(fs.nextInt(),fs.nextInt(),fs.nextInt(),fs.nextInt());
        }

        combination(0,0,1);
        
        System.out.println(max);


    }
    public static void combination(int pos ,int count,int val){
        if(count == n){
            int sum = 0;
            for(int i=0;i<q;i++){
                if(A[array[i].b-1]-A[array[i].a-1] == array[i].c){
                    sum+=array[i].d;
                }
            }
            max = Math.max(sum,max);
        }else{
            for(int i=val;i<=m;i++){
                A[pos] = i;
                combination(pos+1,count+1,i);
            }
        }
    }
}

class ABCD{
    int a,b,c,d;
    ABCD(int a,int b,int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}

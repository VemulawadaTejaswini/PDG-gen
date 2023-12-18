import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int n=scanner.nextInt();
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int[] l=new int[n];
		for(int i=0;i<n;i++){
			l[i]=scanner.nextInt();
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<Math.pow(4, n);i++){
			int tmp1=0;
			int tmp2=0;
			int tmp3=0;
			int mp=0;
			for(int j=0;j<n;j++){
				if((3&(i>>(j*2)))==3){
					if(tmp3!=0){
						mp+=10;
					}
					tmp3+=l[j];
				}else if((2&(i>>(j*2)))==2){
					if(tmp2!=0){
						mp+=10;
					}
					tmp2+=l[j];
				}else if((1&(i>>(j*2)))==1){
					if(tmp1!=0){
						mp+=10;
					}
					tmp1+=l[j];
				}
			}
			if(tmp1==0||tmp2==0||tmp3==0){
				continue;
			}
			mp+=Math.abs(a-tmp1)+Math.abs(b-tmp2)+Math.abs(c-tmp3);
			min=Math.min(min, mp);
		}
		System.out.println(min);
	}
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}

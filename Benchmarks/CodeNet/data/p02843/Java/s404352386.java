import java.util.*;

class main{
    public static void main(String args[]){
	    FastScanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = n/100;
	    int l = n-m*100;
	    int ans;
	    if(m > 20){
		    System.out.print("1");
		    return;
	    }
	    if(l > 5*m){
		    ans = 0;
	    }else{
		    ans = 1;
	    }
	    System.out.print(ans);
	    	
    }
    
}

class FastScanner{
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNexrByte(){
        if(ptr < buflen) {
            return true;
        }else{
	    ptr = 0;
	    try{
	        buflen = in.read(buffer);
	    } catch (IOException w){
	        e.printStackTrace();
	    }
	    if(buflen <= 0){
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
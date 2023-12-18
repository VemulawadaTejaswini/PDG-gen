import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int T1 = sc.nextInt();
		int T2 = sc.nextInt();
		long A1 = sc.nextLong();
		long A2 = sc.nextLong();
		long B1 = sc.nextLong();
		long B2 = sc.nextLong();
		
		// 無限判定
		BigInteger AT1 = new BigInteger(Long.toString((long)A1*T1));
		BigInteger BT1 = new BigInteger(Long.toString((long)B1*T1));
		BigInteger AT2 = new BigInteger(Long.toString((long)A2*T2));
		BigInteger BT2 = new BigInteger(Long.toString((long)B2*T2));
		AT2 = AT2.add(AT1);
		BT2 = BT2.add(BT1);
		if (AT2.compareTo(BT2) == 0) {
			System.out.println("infinity");
			return;
		}
		
		// すれ違い判定
		if (AT1.compareTo(BT1) > 0 == AT2.compareTo(BT2) > 0) {
			System.out.println(0);
			return;
		}
		
		// ここまでくれば必ずT1-T2の間に1度すれ違う
		BigInteger result = BigInteger.ZERO;
		BigInteger X1 = AT1.subtract(BT1).abs();
		BigInteger AT1T2 = AT2.add(AT1);
		BigInteger BT1T2 = BT2.add(BT1);
      
      if (AT1.compareTo(BT1) > 0 ^ AT1T2.compareTo(BT1T2) > 0) {
       System.out.println(1);
        return;
      }
      
      
		BigInteger X2 = AT1T2.subtract(BT1T2).abs();
		BigInteger sabun = X1.subtract(X2);
		BigInteger kaisu = X1.divide(sabun);
		BigInteger amari = X1.remainder(sabun);
		if (amari.compareTo(BigInteger.ZERO) == 0) {
			// 差分が割り切れる場合は2*差分が答え
			result = kaisu.multiply(new BigInteger("2"));
		} else {
			result = kaisu.multiply(new BigInteger("2")).add(BigInteger.ONE);
		}
		
		
		System.out.println(result.toString());
		
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


import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();

		int N = fs.nextInt();
		int M = fs.nextInt();

		PriorityQueue<Long> AList = new PriorityQueue<Long>();
		long sum = 0;
		for (int i = 1; i <= N; i++) {
			Long a = fs.nextLong();
			AList.add(a);
			sum += a;
		}

		PriorityQueue<Sousa> sousaList = new PriorityQueue<Sousa>(new MyComparator());
		for (int i = 1; i <= M; i++) {
			int b = fs.nextInt();
			Long c = fs.nextLong();
			Sousa s = new Sousa(b, c);
			sousaList.add(s);
		}

//		System.out.println(sum);

		boolean endFlag = false;
		for(int i = 1;i <= M;i++) {
			Sousa s = sousaList.poll();
			for(int j = 1;j <= s.B;j++) {
				if(AList.peek() == null) {
					endFlag = true;
					break;
				}
				Long min = AList.poll();
				if(min < s.C) {
//					System.out.println("min:" + min + ",s.C:" + s.C);
					sum = sum - min + s.C;
//					System.out.println(sum);
				}else {
					endFlag = true;
				}
			}
			if(endFlag) break;

		}

		System.out.println(sum);

	}



}

class MyComparator implements Comparator<Sousa> {
	@Override
	public int compare(Sousa s1, Sousa s2) {
		if (s1.C > s2.C) {
			return -1;
		} else if (s1.C < s2.C) {
			return 1;
		} else {
			return 0;
		}
	}
}

class Sousa {
	int B;
	Long C;

	public Sousa(int b, Long c) {
		B = b;
		C = c;
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

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		String s=sc.next();
		StringBuilder sb = new StringBuilder();

		if(s.length()==1) {
			print(s);
			return;
		}
		
		int[][] score=new int[s.length()][2];
		StringBuilder[][] sbs = new StringBuilder[s.length()][2];
		sbs[0][0]=new StringBuilder();
		sbs[0][1]=new StringBuilder();
		score[0][0]=0;
		score[0][1]=0;
		char bef=s.charAt(0);
		if(bef=='D') {
			score[0][0]+=1;
			score[0][1]+=1;
			sbs[0][0].append('D');
			sbs[0][1].append('D');
		} else if(bef=='P') {
			sbs[0][0].append('P');
			sbs[0][1].append('P');
		}else {
			sbs[0][0].append('P');
			sbs[0][1].append('D');
			score[0][1]+=1;
		}
		for(int i=1,len=s.length();i<len;i++) {
			char c=s.charAt(i);
			if(c=='?') {
				score[i][0]=score[i-1][0];
				score[i][1]=Math.max(score[i-1][0]+2,score[i-1][1]+1);
				if(score[i-1][0]+2>score[i-1][1]+1) {
					sbs[i][0]=new StringBuilder(sbs[i-1][0].toString()+'P');
					sbs[i][1]=new StringBuilder(sbs[i-1][1].toString()+'D');
				} else {
					sbs[i][0]=new StringBuilder(sbs[i-1][1].toString()+'P');
					sbs[i][1]=new StringBuilder(sbs[i-1][1].toString()+'D');										
				}
			} else if(c=='P') {
				sbs[i][0]=new StringBuilder(sbs[i-1][0].toString()+'P');
				sbs[i][1]=new StringBuilder(sbs[i-1][1].toString()+'P');
			} else {
				sbs[i][0]=new StringBuilder(sbs[i-1][0].toString()+'D');
				sbs[i][1]=new StringBuilder(sbs[i-1][1].toString()+'D');
				score[i][0]=score[i-1][0]+1;
				score[i][1]=Math.max(score[i-1][0]+2,score[i-1][1]+1);
			}
		}
		if(score[s.length()-1][0]>score[s.length()-1][1]) {
			print(sbs[s.length()-1][0]);
		}else {
			print(sbs[s.length()-1][1]);
		}
	}
	
	private static void print(Object o) {
		System.out.println(o.toString());
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
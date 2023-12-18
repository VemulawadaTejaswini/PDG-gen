import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int h=scanner.nextInt();
		int w=scanner.nextInt();
		int n=scanner.nextInt();
		List<Integer>list=new ArrayList<>();
		int sum=1;
		for(int i=1;i<=n;i++){
			int a=scanner.nextInt();
			sum+=a;
			list.add(sum);
		}
		int[][] grid=new int[h][w];
		int cnt=0;
		for(int i=0;i<h;i++){
			if(i%2==0){
				for(int j=0;j<w;j++){
					cnt++;
					grid[i][j]=upper_bound(list, cnt)+1;
				}
			}else{
				for(int j=w-1;j>=0;j--){
					cnt++;
					grid[i][j]=upper_bound(list, cnt)+1;
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				sb.append(grid[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	private static int upper_bound(List<Integer> list, int val) {
		return ~Collections.binarySearch(list, val, (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
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

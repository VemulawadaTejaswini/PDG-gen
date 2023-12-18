import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args)throws Exception{
		int H=nextInt();
		int W=nextInt();
		boolean key[][]=new boolean[H][W];
		boolean visit[][]=new boolean[H][W];
		boolean fin=false;
		int ans=0,k=0;
		Deque<Integer> Q=new ArrayDeque<Integer>();
		for(int i=0;i<H;i++){
			String a=next();
			for(int j=0;j<W;j++){
				char b=a.charAt(j);
				if(b=='#'){
					key[i][j]=true;k++;
				}
			}
		}
		Q.add(0);Q.add(0);Q.add(1);visit[0][0]=true;
		while(Q.size()>0){
			int i=Q.poll();
			int j=Q.poll();
			int cout=Q.poll();
			if(i==H-1&&j==W-1){
				fin=true;ans=cout;
				break;
			}
			if(j!=W-1&&key[i][j+1]&&visit[i][j+1]==false){
				Q.add(i);Q.add(j+1);Q.add(cout+1);visit[i][j+1]=true;
			}
			if(i!=H-1&&key[i+1][j]&&visit[i+1][j]==false){
				Q.add(i+1);Q.add(j);Q.add(cout+1);visit[i+1][j]=true;
			}
		}
		if(fin&&k==ans)
			System.out.println("Possible");
		else
			System.out.println("Impossible");
	}
	//FastScanner
	static InputStream in = System.in;
	static  byte[] buffer = new byte[1024];
	static int length = 0, p = 0;
	public static boolean hasNextByte () {
		if (p < length) return true;
		else {
			p = 0;
			try {length = in.read(buffer);}
			catch (Exception e) {e.printStackTrace();}
			if (length == 0) return false;
		}
		return true;
	}
	public static int readByte () {
		if (hasNextByte() == true) return buffer[p++];
		return -1;
	}
	public static boolean isPrintable (int n) {return 33<=n&&n<=126;}
	public static void skip () {
		while (hasNextByte() && !isPrintable(buffer[p])) p++;
	}
	public static boolean hasNext () {skip(); return hasNextByte();}
	public static String next () {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int temp = readByte();
		while (isPrintable(temp)) {
			sb.appendCodePoint(temp);
			temp = readByte();
		}
		return sb.toString();
	}
	public static int nextInt () {return Math.toIntExact(nextLong());}
	public static int[] nextInts (int n) {
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = nextInt();
		return ar;
	}
	public static long nextLong () {
		if (!hasNext()) throw new NoSuchElementException();
		boolean minus = false;
		int temp = readByte();
		if (temp == '-') {
			minus = true;
			temp = readByte();
		}
		if (temp<'0' || '9'<temp) throw new NumberFormatException();
		long n = 0;
		while (isPrintable(temp)) {
			if ('0'<=temp && temp<='9') {
				n *= 10;
				n += temp - '0';
			}
			temp = readByte();
		}
		return minus? -n : n;
	}
}

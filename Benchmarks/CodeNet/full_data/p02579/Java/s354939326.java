import java.util.*;		
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;
public class Main{
	static public void main(String args[])throws IOException{
		int tt=1;
		StringBuilder sb=new StringBuilder();
		for(int ttt=1;ttt<=tt;ttt++){
			int h=i();
			int w=i();
			int ch=i()-1;
			int cw=i()-1;
			int dh=i()-1;
			int dw=i()-1;
			int[][] a=new int[h][w];
			for(int i=0;i<h;i++){
				String s=s();
				for(int j=0;j<w;j++){
					if(s.charAt(j)=='#'){
						a[i][j]=0;
					}else{
						a[i][j]=1;
					}
				}
			}
			int[][] tmp=new int[h][w];
			boolean[][] visited=new boolean[h][w];
			int k=1;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(visited[i][j]==false && a[i][j]==1){
						Queue<Pair> queue=new LinkedList<>();
						queue.add(new Pair(i,j,0));
						visited[i][j]=true;
						while(queue.isEmpty()==false){
							Pair p=queue.poll();
							tmp[p.x][p.y]=k;
							int[] dx=new int[]{1,-1,0,0};
							int[] dy=new int[]{0,0,1,-1};
							for(int l=0;l<4;l++){
								int xx=p.x+dx[l];
								int yy=p.y+dy[l];
								if(xx<0 || yy<0 || xx>=h || yy>=w){
									continue;
								}
								if(visited[xx][yy]==false && a[xx][yy]==1){
									visited[xx][yy]=true;
									queue.add(new Pair(xx,yy,0));
								}
							}
						}
						k++;
					}
				}
			}
			visited=new boolean[h][w];
			int[][] dp=new int[h][w];
			Queue<Pair> queue=new LinkedList<>();
			queue.add(new Pair(ch,cw,0));
			visited[ch][cw]=true;
			dp[ch][cw]=0;
			while(queue.isEmpty()==false){
				Pair p=queue.poll();
				int[] dx=new int[]{1,-1,0,0};
				int[] dy=new int[]{0,0,1,-1};
				for(int i=0;i<4;i++){
					int xx=p.x+dx[i];
					int yy=p.y+dy[i];
					if(xx<0 || yy<0 || xx>=h || yy>=w){
						continue;
					}
					if(visited[xx][yy]==false && a[xx][yy]==1){
						visited[xx][yy]=true;
						dp[xx][yy]=p.z;
						queue.add(new Pair(xx,yy,p.z));
					}
				}
				int startx=p.x-2;
				int starty=p.y-2;
				for(int i=startx;i<startx+5;i++){
					for(int j=starty;j<starty+5;j++){
						if(i<0 || j<0 || i>=h || j>=w){
							continue;
						}
						if(tmp[i][j]!=tmp[p.x][p.y] && visited[i][j]==false && a[i][j]==1){
							queue.add(new Pair(i,j,p.z+1));
							dp[i][j]=p.z+1;
							visited[i][j]=true;
						}
					}
				}
			}
			int min=Integer.MAX_VALUE;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(tmp[i][j]==tmp[dh][dw]){
						min=Math.min(min,dp[dh][dw]);
					}
				}
			}
			if(visited[dh][dw]==false){
				pln("-1");
			}else{
				pln(min+"");
			}
		}
		System.out.print(sb.toString());
	}
	static InputReader in=new InputReader(System.in);
	static OutputWriter out=new OutputWriter(System.out);
	static ArrayList<ArrayList<Integer>> graph;
	static int mod=1000000007;
	static class Pair{
		int x;
		int y;
		int z;
		Pair(int x,int y,int z){
			this.x=x;
			this.y=y;
			this.z=z;
		}
		/*@Override
		public int hashCode() 
		{ 
			final int temp = 14; 
			int ans = 1; 
			ans =x*31+y*13; 
			return (int)ans;
		}
       @Override
        public boolean equals(Object o) 
        { 
            if (this == o) { 
                return true; 
            } 
            if (o == null) { 
                return false; 
            } 
            if (this.getClass() != o.getClass()) { 
                return false; 
            } 
            Pair other = (Pair)o; 
            if (this.x != other.x || this.y!=other.y) { 
                return false; 
            } 
            return true; 
        }*/
	}
	public static long[] sort(long[] a){
		int n=a.length;
		ArrayList<Long> ar=new ArrayList<>();
		for(int i=0;i<a.length;i++){
			ar.add(a[i]);
		}
		Collections.sort(ar);
		for(int i=0;i<n;i++){
			a[i]=ar.get(i);
		}
		return a;
	}
	public static long pow(long a, long b){
        long result=1;
        while(b>0){
            if (b % 2 != 0){
                result=(result*a);
                b--;
            } 
            a=(a*a);
            b /= 2;
        }   
        return result;
    }
	public static long gcd(long a, long b){
        if (a == 0){
            return b;
		}
        return gcd(b%a, a);
    }
	public static long lcm(long a, long b){
		return a*(b/gcd(a,b));
	}
	public static long l(){
		String s=in.String();
		return Long.parseLong(s);
	}
	public static void pln(String value){
		System.out.println(value);
	}
	public static int i(){
		return in.Int();
	}
	public static String s(){
		return in.String();
	}
}
class InputReader 
{
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;
	public InputReader(InputStream stream) {
		this.stream = stream;
	}
	public int read() {
		if (numChars== -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}
	public int Int() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	public String String() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	} 
	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	} 
	public String next() {
		return String();
	} 
	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}
class OutputWriter {
	private final PrintWriter writer;
	public OutputWriter(OutputStream outputStream) {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
	}
	public OutputWriter(Writer writer) {
		this.writer = new PrintWriter(writer);
	}
	public void print(Object...objects) {
		for (int i = 0; i < objects.length; i++) {
			if (i != 0)
				writer.print(' ');
			writer.print(objects[i]);
		}
	}
	public void printLine(Object...objects) {
		print(objects);
		writer.println();
	}
	public void close() {
		writer.close();
	}
	public void flush() {
		writer.flush();
	}
 }
class IOUtils {
	public static int[] readIntArray(InputReader in, int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = in.Int();
		return array;
	}
} 

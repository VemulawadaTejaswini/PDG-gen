import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
public class Main {
	public static void main(String[] args)throws Exception{
		PrintWriter out = new PrintWriter(System.out);
		int N=nextInt();
		int Q=nextInt();
		int x=N-1,y=N-1;
		long ans=(long)(N-2)*(N-2);
		ArrayList<Integer> X=new ArrayList<Integer>();
		ArrayList<Integer> Y=new ArrayList<Integer>();
		int hx[]=new int[N];
		int hy[]=new int[N];
		X.add(N-1);Y.add(N-1);
		hx[0]=N-1; hx[N-1]=N-1;
		hy[0]=N-1; hy[N-1]=N-1;
		for(int i=0;i<Q;i++){
			int a=nextInt();
			int b=nextInt();
			int c=0;
			if(a==1){
				c=binary(b-1,X);
				ans-=hx[X.get(c)]-1;
				if(x>b){
					if(hy[hx[X.get(c)]]==0)
						Y.add(0,hx[X.get(c)]);
					hy[0]=b-1;
					hy[hx[X.get(c)]]=b-1;
					x=b;
				}
			}
			else{
				c=binary(b-1,Y);
				if(c<0)
					c=0;
				ans-=hy[Y.get(c)]-1;
				if(y>b){
					if(hx[hy[Y.get(c)]]==0)
						X.add(0,hy[Y.get(c)]);
					hx[0]=b-1;
					hx[hy[Y.get(c)]]=b-1;
					y=b;
				}
			}
		}
		System.out.println(ans);
	}
	public static long lmod(long i, long j) {
	     return (i%j)<0?(i%j)+0+(j<0?-j:j):(i%j+0);
	 }
	static boolean isOK(int index,int key,ArrayList<Integer> a){
		if (a.get(index)>=key) return true;
	    else return false;
	}
	static int binary(int key,ArrayList<Integer> a) {
	    int ng = -1; //「index = 0」が条件を満たすこともあるので、初期値は -1
	    int ok = (int)a.size(); // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()
	    while (Math.abs(ok - ng) > 1) {
	        int mid = (ok + ng) / 2;
	        if (isOK(mid,key,a)) ok = mid;
	        else ng = mid;
	    }
	    return ok;
	}
	class UnionFind {
	    int Parent[];
	    UnionFind(int n) {// Initialize by -1
	        Parent = new int[n];
	        Arrays.fill(Parent, -1);
	    }
	    int root(int A) {// In which tree is A?
	        if (Parent[A] < 0)
	            return A;
	        return Parent[A] = root(Parent[A]);
	    }
	    int size(int A) {// size of tree which is include A
	        return -Parent[root(A)];
	    }
	    boolean connect(int A, int B) {// Connect A and B
	        A = root(A);
	        B = root(B);
	        if (A == B)
	            return false;
	        if (size(A) < size(B)) {
	            int C = 0;
	            C = B;
	            B = A;
	            A = C;
	        } // SWAP
	        Parent[A] += Parent[B];
	        Parent[B] = A;
	        return true;
	    }
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
class Pint {
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pint) {
            Pint other = (Pint) obj;
            return other.first == this.first && other.second == this.second;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.first, this.second);
    }

    public int first;
    public int second;

    Pint(int x, int y) {
        first = x;
        second = y;
    }

    void set(int x, int y) {
        first = x;
        second = y;
    }
}
class Tpair {
    public int first;
    public int second;
    public long third;

    Tpair(int x, int y, long z) {
        first = x;
        second = y;
        third = z;
    }

    void set(int x, int y, long z) {
        first = x;
        second = y;
        third = z;
    }
}

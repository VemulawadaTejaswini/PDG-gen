import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;

public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        long k = sc.nextLong();
        
        int[] a = new int[n];
        int max = 0;
        
        int[] cyclenum = new int[n];

        for(int i=0;i<n;i++){
        	a[i] = sc.nextInt();
        	if(max < a[i]){
        		max = a[i];
        	}
        }
        
        IDList[] idl = new IDList[max+1];
        for(int i=0;i<max+1;i++){
        	idl[i] = new IDList();
        }
        
        for(int i=0;i<n;i++){
        	idl[a[i]].add(i);
        }
        
        boolean notSimple = false;
        int start = 0;
        
        ArrayList<Integer> cycle = new ArrayList<>();
        
        int i = 0;
        loop:while(true){
        	while(aftersize(idl[a[i]],i) %2 == 0){
        		i = idl[a[i]].get(idl[a[i]].size()-1) + 1;
            	if(i==n){
            		break loop;
            	}
        	}
        	
        	//i以降に奇数個
        	if(cyclenum[i] != 0){
        		notSimple = true;
        		start = cyclenum[i];
        		break loop;
        	}
        	
    		cycle.add(a[i]);
    		cyclenum[i] = cycle.size();
    		i = idl[a[i]].get(0)+1;
        	
        	if(i==n){
        		break loop;
        	}
        }
        
        boolean dame = false;
        if(notSimple){
        	if(k > start){
        		dame = true;
        		k -= (start);
        		k++;
        		ArrayList<Integer> newc = new ArrayList<>();
        		for(int l=start-1;l<cycle.size();l++){
        			newc.add(cycle.get(l));
        		}
        		cycle = newc;
        	}
        }
        
        int csize = cycle.size()+1;
        if(dame){
        	csize --;
        }
        
        int maelastid = (int)((k-2)%csize);
        if(maelastid < 0){
        	maelastid += csize;
        }
        int maelast = -1;
        
        if(maelastid == csize-1){
        	maelast = -1;
        }
        else{
        	maelast = cycle.get(maelastid);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int id = 0;
        
        if(maelast != -1){
        	id = idl[maelast].get(0) + 1;
        }
        
        while(id<n){
        	if(aftersize(idl[a[id]],id) > 1){
        		int from = 0;
        		int to = idl[a[id]].size()-1;
        		int lb = lowerBound(idl[a[id]],id,from,to);
        		id = idl[a[id]].get(lb+1) + 1;
        	}
        	else{
        		ans.add(a[id]);
        		id ++;
        	}
        }
        
		for(int j=0;j<ans.size()-1;j++){
			out.print(ans.get(j));
			out.print(" ");
		}
		if(ans.size()!=0){
			out.println(ans.get(ans.size()-1));
		}
		else{
			out.println();
		}
        
        out.flush();
    }
    
	static void print(ArrayList<Integer> a){
		for(int i=0;i<a.size()-1;i++){
			System.out.print(a.get(i));
			System.out.print(" ");
		}
		System.out.println(a.get(a.size()-1));
	}
    
    int aftersize(IDList l, int id){
    	int size = l.size();
		int from = 0;
		int to = l.size()-1;
    	int lb = lowerBound(l,id,from,to);
    	
    	return size - lb;
    }

	static int lowerBound(IDList a, long key, int from, int to){
		if(from == to){
			if(a.get(from)<key){
				return from+1;
			}
			else{
				return from;
			}
		}
		int m = (from+to+1)/2;	//オーバーフロー対策なし
		long am = a.get(m);
		
		if(key<=am){
			return lowerBound(a,key,from,m-1);
		}
		else{
			return lowerBound(a,key,m,to);
		}
	}
}

class IDList extends ArrayList<Integer>{
	private static final long serialVersionUID = -4461479015945373120L;
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
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
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
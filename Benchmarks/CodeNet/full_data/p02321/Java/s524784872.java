import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        long W = sc.nextLong();
        long[] v = new long[n];
        long[] w = new long[n];
        
        for(int i=0;i<n;i++){
        	v[i] = sc.nextLong();
        	w[i] = sc.nextLong();
        }
        
        System.out.println(hugeKnapsack(w,v,W));
        
    }
    
    static long hugeKnapsack(long[] weight, long[] value, long capacity){
        int N = weight.length;
         
        //半分全列挙
        //S:0 - (N/2)-1
        //T:N/2 - N-1
        ArrayList<Items> SL = new ArrayList<>();
        for(int S = (1<<(N/2)) -1;S>=0;S--){
            Items it = new Items();
            for(int i=0;i<N/2;i++){
                if(((S>>i)&1) == 1){
                    it.addItem(weight[i], value[i]);
                }
            }
            if(it.tweight<=capacity){
                SL.add(it);
            }
        }
         
        ArrayList<Items> TL = new ArrayList<>();
        int Tnum = N-(N/2);
        int Tstt = N/2;
        for(int S = (1<<Tnum) -1;S>=0;S--){
            Items it = new Items();
            for(int i=0;i<Tnum;i++){
                if(((S>>i)&1) == 1){
                    it.addItem(weight[Tstt + i], value[Tstt + i]);
                }
            }
            if(it.tweight<=capacity){
                TL.add(it);
            }
        }
         
        Collections.sort(SL);
        Collections.sort(TL);
         
        //下位互換の削除
        ArrayList<Items> newSL = new ArrayList<>();
        ArrayList<Items> newTL = new ArrayList<>();
        long preV = -1;
        for(Items it:SL){
            if(it.tvalue>preV){
                preV = it.tvalue;
                newSL.add(it);
            }
        }
        SL = newSL;
        preV = -1;
        for(Items it:TL){
            if(it.tvalue>preV){
                preV = it.tvalue;
                newTL.add(it);
            }
        }
        TL = newTL;
         
        long max = 0;
        for(int s=0;s<SL.size();s++){
            long W = SL.get(s).tweight;
            long V = SL.get(s).tvalue;
            int tid = lowerBound(TL,capacity-W);
            max = Math.max(max, V + TL.get(tid-1).tvalue);
            //対応するtは単調減少なので末尾部分はもういらないが、削除した方が若干遅くなる
        }
         
        return max;
    }
    static int lowerBound(ArrayList<Items> a, long key){
        Items it = new Items(key,-1);
        int idx = Collections.binarySearch(a, it);
        //ほんとうはlowerBoundになっていない。検索するのはtweightの被りがないリストなので問題ない。
         
        if(idx<0){
            idx = ~idx;
        }
         
        return idx;
    }

}

class Items implements Comparable<Items>{
    long tweight;
    long tvalue;
    public Items(){
        this.tweight = 0;
        this.tvalue = 0;
    }
    public Items(long tweight, long tvalue){
        this.tweight = tweight;
        this.tvalue = tvalue;
    }
    void addItem(long weight, long value){
        tweight += weight;
        tvalue += value;
    }
    @Override
    public int compareTo(Items o){
        if(tweight == o.tweight){
            return Long.compare(o.tvalue, tvalue);
        }
        return Long.compare(tweight, o.tweight);
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
	public int[] nextIntArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
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
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		n=scanner.nextInt();
		int[] a=new int[n-1];
		int[] b=new int[n-1];
		graph=new boolean[n][n];
		for(int i=0;i<n-1;i++){
			a[i]=scanner.nextInt()-1;
			b[i]=scanner.nextInt()-1;
			graph[a[i]][b[i]]=true;
			graph[b[i]][a[i]]=true;
		}
		List<Integer>tmp=new ArrayList<>();
		tmp.add(0);
		dfs(0,tmp);
		Deque<Integer>queF=new ArrayDeque<>();
		for(int i=0;i<Math.ceil(center.size()/2.0);i++){
			queF.add(center.get(i));
		}
		int cntF=0;
		Set<Integer>checked=new HashSet<>();
		while(!queF.isEmpty()){
			int tar=queF.poll();
			checked.add(tar);
			for(int i=0;i<n;i++){
				if(graph[tar][i]&&!center.contains(i)&&!checked.contains(i)){
					queF.add(i);
				}
			}
			cntF++;
		}
		int cntS=n-cntF;
		System.out.println(cntF>cntS?"Fennec":"Snuke");
	}
	static int n;
	static boolean[][] graph;
	static List<Integer>center;
	private static void dfs(int i, List<Integer> tmp) {
		if(i==n-1){
			center=new ArrayList<>(tmp);
			return;
		}
		for(int j=0;j<n;j++){
			if(graph[i][j]&&!tmp.contains(j)){
				List<Integer>tmp1=new ArrayList<>(tmp);
				tmp1.add(j);
				dfs(j,tmp1);
			}
		}
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

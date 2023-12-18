import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int n=scanner.nextInt();
		Map<Integer,Set<Integer>>map=new HashMap<>();
		for(int i=0;i<n-1;i++){
			int a=scanner.nextInt()-1;
			int b=scanner.nextInt()-1;
			if (map.containsKey(a)) {
				map.get(a).add(b);
			} else {
				Set<Integer>set=new HashSet<>();
				set.add(b);
				map.put(a, set);
			}
			if (map.containsKey(b)) {
				map.get(b).add(a);
			} else {
				Set<Integer>set=new HashSet<>();
				set.add(a);
				map.put(b, set);
			}
		}
		Deque<Integer>que=new ArrayDeque<>();
		que.add(0);
		Set<Integer>checked=new HashSet<>();
		int[] memo=new int[n];
		while(!que.isEmpty()){
			int tar=que.poll();
			checked.add(tar);
			for(int i:map.get(tar)){
				if(!checked.contains(i)){
					que.add(i);
					memo[i]=tar;
				}
			}
		}
		List<Integer>center=new ArrayList<>();
		int pre=memo[n-1];
		center.add(n-1);
		while(true){
			center.add(pre);
			if(pre==0){
				break;
			}
			pre=memo[pre];
		}
		Deque<Integer>queS=new ArrayDeque<>();
		for(int i=0;i<center.size()/2;i++){
			queS.add(center.get(i));
		}
		int cntS=0;
		checked=new HashSet<>(center);
		while(!queS.isEmpty()){
			int tar=queS.poll();
			checked.add(tar);
			for(int i:map.get(tar)){
				if(!checked.contains(i)){
					queS.add(i);
				}
			}
			cntS++;
		}
		int cntF=n-cntS;
		System.out.println(cntS<cntF?"Fennec":"Snuke");
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

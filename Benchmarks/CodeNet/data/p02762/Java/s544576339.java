import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {
		static List<Integer> passed = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] ff = new int[n+1];
		Account[] accList = new Account[n + 1];
		for(int i = 1; i <= n; i++) {
			accList[i] = new Account();
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			accList[a].fList.add(b);
			accList[b].fList.add(a);
		}
		for(int i = 0; i < k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			accList[a].bList.add(b);
			accList[b].bList.add(a);
		}
		/*
		for(int i = 1; i <= n; i++) {
			passed.clear();
			DFS(i, i,accList);
			ff[i] += passed.size() - 1;	
			out.println("ff[" + i + "]:" + ff[i]) ;
		}
		*/
		/*
		for(int i =1; i <=n; i++) {
			Account a = accList[i];
			out.print(i + "f:");
			for(int j = 0; j < a.fList.size(); j++) {
				out.print(a.fList.get(j) + " ");
			}
			out.print(" b:");
			for(int j = 0; j < a.bList.size(); j++) {
				out.print(a.bList.get(j) + " ");
			}
			out.println();
		}*/
		
		for( int i = 1; i <= n; i++) {
			long cnt = 0;
			cnt += ff[i] - accList[i].fList.size() ;
			out.print(cnt + " ");
		}

		out.close();
	}
	static void DFS(int node,  int root, Account[] accList) {
		if(!accList[root].bList.contains(node))
		passed.add(node);
		for(int i = 0; i < accList[node].fList.size(); i++) {
			int num = accList[node].fList.get(i);
			if (passed.contains(num))
				continue;
			DFS(num, root, accList);
		}
	}
	
}
class Account {

	List<Integer> fList = new ArrayList<>();
	List<Integer> bList = new ArrayList<>();

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
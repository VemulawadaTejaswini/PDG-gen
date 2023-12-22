import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final int INF = 2 << 28;
	static final long INF_L = 2L << 60;
	static final int  MOD = 1000000007;
	static final long MOD_L = 1000000007L;
	static final int[] vx_4 = {1,0,-1,0};
	static final int[] vy_4 = {0,1,0,-1};
	static final int[] vx_5 = {1,0,-1,0,0};
	static final int[] vy_5 = {0,1,0,-1,0};
	static final int[] vx_8 = {1,1,1,0,0,-1,-1,-1};
	static final int[] vy_8 = {1,0,-1,1,-1,1,0,-1};
	static final int[] vx_9 = {1,1,1,0,0,0,-1,-1,-1};
	static final int[] vy_9 = {1,0,-1,1,0,-1,1,0,-1};
	
	static int idx;
	static char[] in;
	static Node lNode;
	static Node rNode;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(sc.hasNext()) {
			char[] in = sc.next().toCharArray();
			char[] lNodeIn = sc.next().toCharArray();
			char[] rNodeIn = sc.next().toCharArray();
			
			
			Main.in = lNodeIn;
			Node lNode = makeNode();
			
			Main.in = rNodeIn;
			Node rNode = makeNode();
			
			Node res;
			
			
			if(in[0] == 'i') {
				res = ins(lNode,rNode);
			}
			else {
				res = uni(lNode,rNode);
			}
			
			toStr(res);
			System.out.println();
			
		}
	}
	static void toStr(Node res) {
		System.out.print('(');
		if(res.lNode != null) toStr(res.lNode);
		System.out.print(',');
		if(res.rNode != null) toStr(res.rNode);
		System.out.print(')');
	}
	
	static Node ins(Node l, Node r) {
		Node ret = l;
		if(l.lNode != null && r.lNode != null) {
			ret.lNode = ins(l.lNode,r.lNode);
		}
		else {
			ret.lNode = null;
		}
		
		if(l.rNode != null && r.rNode != null) {
			ret.rNode = ins(l.rNode,r.rNode);
		}
		else {
			ret.rNode = null;
		}
		
		return ret;
	}
	static Node uni(Node l, Node r) {
		Node ret = l;
		if(l.lNode != null && r.lNode != null) {
			ret.lNode = uni(l.lNode, r.lNode);
		}
		if(l.lNode != null && r.lNode == null) {
			ret.lNode = l.lNode;
		}
		if(l.lNode == null && r.lNode != null) {
			ret.lNode = r.lNode;
		}
		
		if(l.rNode != null && r.rNode != null) {
			ret.rNode = uni(l.rNode, r.rNode);
		}
		if(l.rNode != null && r.rNode == null) {
			ret.rNode = l.rNode;
		}
		if(l.rNode == null && r.rNode != null) {
			ret.rNode = r.rNode;
		}
		return ret;
	}
	
	static Node makeNode() {
		idx = 0;
		return node();
	}
	
	static Node node() {
		Node ret = new Node();
		idx++;
		if(in[idx] == '(') ret.lNode = node();
		idx++;
		if(in[idx] == '(') ret.rNode = node();
		idx++;
		return ret;
	}
	static class Node {
		Node lNode = null;
		Node rNode = null;
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
    	if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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
}
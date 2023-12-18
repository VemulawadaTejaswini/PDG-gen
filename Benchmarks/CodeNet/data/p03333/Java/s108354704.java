import java.io.*;
import java.util.*;

public class Main {
	static final StdIn in = new StdIn();
	static final PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int n=in.nextInt();
		List<Seg> ss = new ArrayList<Seg>();
		for(int i=0; i<n; ++i)
			ss.add(new Seg(in.nextInt(), in.nextInt(), i));
		long a1=0, a2=0;
		TreeSet<Seg> ts1 = new TreeSet<Seg>(new Comparator<Seg>() {
			public int compare(Seg a, Seg b) {
				return a.b==b.b?a.i-b.i:a.b-b.b;
			}
		});
		ts1.addAll(ss);
		TreeSet<Seg> ts2 = new TreeSet<Seg>(new Comparator<Seg>() {
			public int compare(Seg a, Seg b) {
				return a.a==b.a?a.i-b.i:b.a-a.a;
			}
		});
		ts2.addAll(ss);
		int cl=0;
		while(!ts1.isEmpty()) {
			Seg a=ts1.pollFirst();
			ts2.remove(a);
			if(cl<a.a) {
				a1+=a.a-cl;
				cl=a.a;
			}
			if(cl>a.b) {
				a1+=cl-a.b;
				cl=a.b;
			}
//			System.out.println(ans);
			if(ts2.isEmpty())
				break;
			a=ts2.pollFirst();
			ts1.remove(a);
			if(cl<a.a) {
				a1+=a.a-cl;
				cl=a.a;
			}
			if(cl>a.b) {
				a1+=cl-a.b;
				cl=a.b;
			}
//			System.out.println(ans);
		}
		a1+=Math.abs(cl);
		cl=0;
		ts1.addAll(ss);
		ts2.addAll(ss);
		while(!ts2.isEmpty()) {
			Seg a=ts2.pollFirst();
			ts1.remove(a);
			if(cl<a.a) {
				a2+=a.a-cl;
				cl=a.a;
			}
			if(cl>a.b) {
				a2+=cl-a.b;
				cl=a.b;
			}
//			System.out.println(ans);
			if(ts1.isEmpty())
				break;
			a=ts1.pollFirst();
			ts2.remove(a);
			if(cl<a.a) {
				a2+=a.a-cl;
				cl=a.a;
			}
			if(cl>a.b) {
				a2+=cl-a.b;
				cl=a.b;
			}
//			System.out.println(ans);
		}
		out.println(Math.max(a1, a2+Math.abs(cl)));
		out.close();
	}
	
	static class Seg {
		int a, b, i;
		Seg(int a, int b, int i) {
			this.a=a;
			this.b=b;
			this.i=i;
		}
	}
	
	static class StdIn {
    	final private int BUFFER_SIZE = 1 << 16;
    	private DataInputStream din;
    	private byte[] buffer;
    	private int bufferPointer, bytesRead;
    	public StdIn() {
    		din = new DataInputStream(System.in);
    		buffer = new byte[BUFFER_SIZE];
    		bufferPointer = bytesRead = 0;
    	}
    	public StdIn(InputStream in) {
    		try{
    			din = new DataInputStream(in);
    		} catch(Exception e) {
    			throw new RuntimeException();
    		}
    		buffer = new byte[BUFFER_SIZE];
    		bufferPointer = bytesRead = 0;
    	}
    	public int nextInt() {
    		int ret = 0;
    		byte c = read();
    		while (c <= ' ')
    			c = read();
    		boolean neg = (c == '-');
    		if (neg)
    			c = read();
    		do
    			ret = ret * 10 + c - '0';
    		while ((c = read()) >= '0' && c <= '9');

    		if (neg)
    			return -ret;
    		return ret;
    	}
    	public int[] readIntArray(int n) {
    		int[] ar = new int[n];
    		for(int i=0; i<n; ++i)
    			ar[i]=nextInt();
    		return ar;
    	}
    	private void fillBuffer() throws IOException {
    		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
    		if (bytesRead == -1)
    			buffer[0] = -1;
    	}
    	private byte read() {
    		try{
    			if (bufferPointer == bytesRead)
    				fillBuffer();
    			return buffer[bufferPointer++];
    		} catch(IOException e) {
    			throw new RuntimeException();
    		}
    	}
    	public void close() throws IOException {
    		if (din == null)
    			return;
    		din.close();
    	}
    }
}
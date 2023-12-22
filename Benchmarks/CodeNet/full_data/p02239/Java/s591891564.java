import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
     
public class Main{
    
    static InputReader ir;
    static PrintWriter out;

    static void solve(){
	int n=ir.nextInt();
        Graph[] g=new Graph[n];
	for(int i=0;i<n;i++)
	    g[i]=new Graph();
	for(int i=0;i<n;i++){
	    int u=ir.nextInt()-1;
	    int k=ir.nextInt();
	    for(int j=0;j<k;j++){
	        g[u].add(ir.nextInt()-1);
	    }
	}
	int[] d=new int[n];
	Arrays.fill(d,-1);
	Deque<Integer> que=new ArrayDeque<Integer>();
	que.offerLast(0);
	d[0]=0;
	while(!que.isEmpty()){
	    int from=que.pollFirst();
	    for(int i=0;i<g[from].size();i++){
		int to=g[from].get(i);
		if(d[to]==-1||d[to]>d[from]+1){
		    d[to]=d[from]+1;
		    que.offerLast(to);
		}
	    }
	}
	for(int i=0;i<n;i++){
	    out.println(i+1+" "+d[i]);
	}
    }

    public static void main(String[] args) throws Exception {
	ir = new InputReader(System.in);
     	out = new PrintWriter(System.out);
	solve();
	out.flush();
     }

    static class Graph extends ArrayList<Integer>{}
 
    static class InputReader {
	private InputStream in;
	private byte[] buffer=new byte[1024];
	private int curbuf;
	private int lenbuf;

	public InputReader(InputStream in) {this.in=in; this.curbuf=this.lenbuf=0;}
   
	public boolean hasNextByte() {
	    if(curbuf>=lenbuf){
		curbuf= 0;
		try{
		    lenbuf=in.read(buffer);
		}catch(IOException e) {
		    throw new InputMismatchException();
		}
		if(lenbuf<=0) return false;
	    }
	    return true;
	}
  
	private int readByte(){if(hasNextByte()) return buffer[curbuf++]; else return -1;}
 
	private boolean isSpaceChar(int c){return !(c>=33&&c<=126);}
  
	private void skip(){while(hasNextByte()&&isSpaceChar(buffer[curbuf])) curbuf++;}
 
	public boolean hasNext(){skip(); return hasNextByte();}
  
	public String next(){
	    if(!hasNext()) throw new NoSuchElementException();
	    StringBuilder sb=new StringBuilder();
	    int b=readByte();
	    while(!isSpaceChar(b)){
		sb.appendCodePoint(b);
		b=readByte();
	    }
	    return sb.toString();
	}
  
	public int nextInt() {
	    if(!hasNext()) throw new NoSuchElementException();
	    int c=readByte();
	    while (isSpaceChar(c)) c=readByte();
	    boolean minus=false;
	    if (c=='-') {
		minus=true;
		c=readByte();
	    }
	    int res=0;
	    do{
		if(c<'0'||c>'9') throw new InputMismatchException();
		res=res*10+c-'0';
		c=readByte();
	    }while(!isSpaceChar(c));
	    return (minus)?-res:res;
	}
  
	public long nextLong() {
	    if(!hasNext()) throw new NoSuchElementException();
	    int c=readByte();
	    while (isSpaceChar(c)) c=readByte();
	    boolean minus=false;
	    if (c=='-') {
		minus=true;
		c=readByte();
	    }
	    long res = 0;
	    do{
		if(c<'0'||c>'9') throw new InputMismatchException();
		res=res*10+c-'0';
		c=readByte();
	    }while(!isSpaceChar(c));
	    return (minus)?-res:res;
	}
  
	public double nextDouble(){return Double.parseDouble(next());}
  
	public int[] nextIntArray(int n){
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
		a[i]=nextInt();
	    return a;
	}
  
	public char[][] nextCharMap(int n,int m){
	    char[][] map=new char[n][m];
	    for(int i=0;i<n;i++)
		map[i]=next().toCharArray();
	    return map;
	}
    }
}


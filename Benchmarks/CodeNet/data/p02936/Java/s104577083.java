import java.util.*;
import static java.lang.System.*;

import java.io.IOException;
import java.io.InputStream;

public class Main{
	  static  long[] score;
	  static Node[] nodeList;
		static boolean[] visited;
  public static void main(String[] args){
	  FastScanner sc = new FastScanner();  
	  int N = sc.nextInt();
	  int Q = sc.nextInt();
	  score = new long[N+10];
	  nodeList = new Node[N+10];
	  for(int i=1; i<=N; i++) {
		  nodeList[i] = new Node(i);
	  }
	  
	  //木構造を生成
	  for(int i=0; i<N-1; i++) {
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  nodeList[a].connect.add(b);
		  nodeList[b].connect.add(a);		  
	  }
	  for(int i=0; i<Q; i++) {
		  int p = sc.nextInt();
		  score[p] += sc.nextInt();
	  }
		visited = new boolean[N+10];
		visited[1] = true;
	  dfs(1);
	  
	  for(int i=1 ; i<= N; i++) {
		  out.print(score[i] + " ");
	  } 
	  
	}
     static void dfs(int n){
    	 visited[n] = true;
    	 for(int i=0; i<nodeList[n].connect.size(); i++) {
    		 int m = nodeList[n].connect.get(i);
    		 if(!visited[m]) {
    			 score[m] += score[n];
    			 dfs(m);
    		 }
    	 }
     }
  }	
//木クラス
	class Node {
		final int number;
		List<Integer> connect; //枝で繋がっている木
		
		public Node(int number) {
			this.number = number;
			this.connect = new ArrayList<>();
		}
	}
	class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte(){
	        if(ptr < buflen){
	            return true;
	        }else{
	            ptr = 0;
	            try{
	                buflen = in.read(buffer);
	            }catch(IOException e){
	                e.printStackTrace();
	            }
	            if(buflen <= 0){
	                return false;
	            }
	        }
	        return true;
	    }
	    private int readByte(){
	        if(hasNextByte()) return buffer[ptr++];
	        else return -1;
	    }
	    private static boolean isPrintableChar(int c){
	        return 33 <= c && c <= 126;
	    }
	    public boolean hasNext(){
	        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
	        return hasNextByte();
	    }
	    public String next(){
	        if(!hasNext()) throw new NoSuchElementException();
	        StringBuilder sb = new StringBuilder();
	        int b = readByte();
	        while(isPrintableChar(b)){
	            sb.appendCodePoint(b);
	            b = readByte();
	        }
	        return sb.toString();
	    }
	    public long nextLong(){
	        if(!hasNext()) throw new NoSuchElementException();
	        long n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if(b == '-'){
	            minus = true;
	            b = readByte();
	        }
	        if(b < '0' || '9' < b){
	            throw new NumberFormatException();
	        }
	        while(true){
	            if('0' <= b && b <= '9'){
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
	    public int nextInt(){
	        long nl = nextLong();
	        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
	        return (int) nl;
	    }
	    public double nextDouble(){
	        return Double.parseDouble(next());
	    }
	}
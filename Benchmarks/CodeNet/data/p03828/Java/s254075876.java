import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;


public class Main {
	public static void main(String[] args) {
		slover();
		out.flush();
	}
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//StringBuffer S = new StringBuffer(sc.next());
	//String hoge2 = str.reverse().toString();
	//map.containsKey(A)
	//Map<Integer, Integer> map = new HashMap<Integer, Integer>(N);
	/*for ( キーのデータ型 key : マップの名前.keySet() ) {
		データのデータ型 data = マップの名前.get( key );
		
		// keyやdataを使った処理;
	}*/
	//int i = Integer.parseInt(s);
	//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek BFSは前から実行される
	//Deque<String> dd=new ArrayDeque<>();//push後ろに入れる,poll(pop)後ろからとる,peek addは先頭に入るからバグ注意 
	//stackdfsは後ろから実行される
	//ArrayList<Integer> cc = new ArrayList<>(N);
	//cc.contains(tmp)
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");//1 1 2 3 5

	

	
	
	private static void slover() {
	    
		
		int N=sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(N);
		boolean x=true;
		for(int a=N;a>0;a--) {
			int v=a;
			for(int i=2;i<=v;i++) {
				if(v==1)break;
				if(v%i==0) {
					
					if(!map.containsKey(i)){
						map.put(i, 0);
					}
					map.replace(i, map.get(i)+1);
					v/=i;
					i=1;
					continue;
				}
			}
		}
		long ans=1;
		for(int i:map.keySet()) {
			//p(i+" "+map.get(i));
			ans*=(map.get(i)+1);
			ans%=1000000007;
		}
		
		p(ans);
		
		
		
		
		
		
		
	}
	            
	     static void nibun(int a,int b,int target) {   
	    	 
	    	 int ok=a;
	    	 int ng=b;
	    	 
	    	 
	    	 int t=2;
	    	 
	    	 while(a<b) {
	    		 int G=(ok+ng)/2;
	    		 if(t==target) {
	    			 break;
	    		 }
	    		 if(t>ok) {
	    			 
	    		 }
	    		 if(t>ng) {
	    			 
	    		 }
	    		 
	    		 
	    		 
	    	 }
	    	 
	    	 
	    	 
	     }
	        
	    
	    

	
		//StringBuffer str = new StringBuffer(sc.nextInt());
		//for(int i=0;i<N;i++) {}
    
		
		
				
			//	p("===================");
				//for(int f:gyo.keySet()){
				    //p(gyo.get(f));
			//	}
			//	p("===================");
				
	           
		
		
		
		
		

	
	
	


	
	static void p(String ans) {out.println(ans);};
	static void p(int ans) {out.println(ans);};
	static void p() {out.println();};
	static void p(long ans) {out.println(ans);};
	static void p(double ans) {out.println(ans);};
	
	static void pn(String ans) {out.print(ans);};
	static void pn(int ans) {out.print(ans);};
	static void pn() {out.print("");};
	static void pn(long ans) {out.print(ans);};
	static void pn(double ans) {out.print(ans);};
	
	static class FastScanner {
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
	      if (hasNextByte()) return buffer[ptr++];
	      else return -1;
	    }

	    private static boolean isPrintableChar(int c) {
	      return 33 <= c && c <= 126;
	    }

	    private void skipUnprintable() {
	      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
	    }

	    public boolean hasNext() {
	      skipUnprintable();
	      return hasNextByte();
	    }

	    public String next() {
	      if (!hasNext()) throw new NoSuchElementException();
	      StringBuilder sb = new StringBuilder();
	      int b = readByte();
	      while (isPrintableChar(b)) {
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
	      return (int) nextLong();
	    }
	    
	    public double nextDouble(){
	    	return Double.parseDouble(next());
	    }

	    public int[] nextIntArray(int N, boolean oneBased) {
	      if (oneBased) {
	        int[] array = new int[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      } else {
	        int[] array = new int[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      }
	    }

	    public long[] nextLongArray(int N, boolean oneBased) {
	      if (oneBased) {
	        long[] array = new long[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      } else {
	        long[] array = new long[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      }
	    }
	  }
}
	

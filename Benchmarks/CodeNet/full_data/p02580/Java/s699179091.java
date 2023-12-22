import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class Main {
	public static void main(String[] args) {
		
		for(int i=0;i<1;i++) {
			
			slover();
			out.flush();
		}
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
		//PriorityQueue<Integer> r=new PriorityQueue<Integer>();//add poll
	//Set<Long> a=new HashSet<Long>();
	//Integer.toBinaryString(i);
	//Integer.toString(i, 2);
//	//Integer.parseInt(bin, 2);
	//bitset
	
	private static int slover()   {
		int H=sc.nextInt();
		int W=sc.nextInt();
		int M=sc.nextInt();
		//int h[]=new int[M];
		//int w[]=new int[M];
		int dp1[]=new int[H];
		int dp2[]=new int[W];
		int dp3[][]=new int[H][W];
		for(int i=0;i<M;i++) {
			int h=sc.nextInt();
			int w=sc.nextInt();
			dp3[h-1][w-1]++;
			dp1[h-1]++;
			dp2[w-1]++;
			}
		int t=0;
		for(int i=0;i<H;i++) {		
			t=Math.max(t, dp1[i]);
		}int t2=0;
		for(int i=0;i<W;i++) {
			t2=Math.max(t2, dp2[i]);
		}
		
		int t3=0;
		for(int i=0;i<H;i++) {		
			if(dp1[i]==t)continue;
			t3=Math.max(t3, dp1[i]);
		}int t4=0;
		for(int i=0;i<W;i++) {
			if(dp2[i]==t2)continue;
			t4=Math.max(t4, dp2[i]);
		}ArrayList<Integer> cc = new ArrayList<>();
		for(int i=0;i<W;i++) {
			if(dp2[i]==t) {
				cc.add(i);
			}
			if(dp2[i]==t3) {
				cc.add(i);
			}
		}
		int max=0;
		for(int i=0;i<H;i++) {
			if(dp1[i]==t) {
				for(int g:cc) {
					max=max(dp1[i]+dp2[g]-dp3[i][g],max);
				}
			}
			if(dp1[i]==t3) {
				for(int g:cc) {
					max=max(dp1[i]+dp2[g]-dp3[i][g],max);
				}
			}
			if(max==H+W-1)break;
		}
		p(max);
		
		
		
		return 0;
	}
	private static int max(int ...a) {
		int max=0;
		for(int t:a) {
			max=Math.max(t, max);
		}
		return max;
	}
private static class D{
		int x,y;
		D(int x,int y){
			this.x=x;;
			this.y=y;
			
		}
 
	}
	static void p(String ans) {out.println(ans);};
	static void p(int ans) {out.println(ans);};
	static void p() {out.println();};
	static void p(long ans) {out.println(ans);};
	static void p(double ans) {out.println(ans);};

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


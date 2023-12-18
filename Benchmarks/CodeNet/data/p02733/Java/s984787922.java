import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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


		private static int INF =1000000007;



		private static class D{
			int a,b;
			D(int a,int b){
				this.a=a;;
				this.b=b;

			}

		}



	//Set<Long> a=new HashSet<Long>();
	private static int mod=1000000007;
	private static int check(int s,int e,char a[][],char target,int w,int K) {
		int count=0;
		int ans=0;
		for(int i=0;i<w;i++) {
			int temp=0;
			for(int t=s;t<=e;t++) {
				if(a[t][i]==target) {
					temp++;
				}
			}
			if(temp>K) {
				return mod;
			}
			if(temp+count>K) {
				ans++;
				count=0;
			}
			count+=temp;
			
		}
		return ans;
	}
	
	
	private static int slover() {

		int H=sc.nextInt();
		int W=sc.nextInt();
		int K=sc.nextInt();
		char S[][]=new char[H][W];
		for(int i=0;i<H;i++) {
			S[i]=sc.next().toCharArray();
		}
		int ans=mod;
		
		for(int i=0;i<1<<(H-1);i++) {
			int s=0;int e=-1;
			int temp=0;
			int count=0;
			for(int t=0;t<H-1;t++) {
				if((1&i>>t)==1) {
					count++;
					s=e+1;
					e=t;
					temp=Math.max(temp, check(s,e,S,'1',W,K));
				}else if(t==H-2) {
					
					s=e+1;
					e=H-1;
					temp=Math.max(temp, check(s,e,S,'1',W,K));
				}
				
			}
			ans=Math.min(ans, temp+count);
			
		}
		p(ans);
		
		return 1;
	}
	public static long gcd(long num1,long num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }
	public static long lcm(long num1,long num2) {
		return num1*num2/gcd(num1,num2);
	}
	private static void bubunwa() {
		int N=sc.nextInt();
		int K=sc.nextInt();
		int a[]=sc.nextIntArray(N, false);

		boolean dp[] =new boolean[K+1];

		Arrays.fill(dp, false);
		dp[0]=true;
		for(int i=0;i<N;i++) {
			for(int x=K-a[i];x>=0;x--) {
				if(dp[x])dp[x+a[i]]=true;
			}
		}

		p(dp[K] ? "Yes":"No");
	}
	private static long modPow(int i,int t,int mod) {
		//iのt乗をO(log t)で返す
		long a=i;;
		long res=1;
		while(t!=0) {
			//p(t);
			if((1&t)==1) {
				res=res*a%mod;
			}
			a=a*a%mod;
			t=t>>1;
		}
		return res;




	}
	private static String bitToString(int i) {
		
			String T="";
			for(int j=0;j<2;j++) {
				//if(i>>j==0)break;
				if((1&i>>j)==1) {
					T+="1";
				}else T+="0";
			}
			return (i+" "+T);

		

	}
/*********************************************************************/
	//target以下までの値のindexを返す
	//target以上が欲しいときは返り値+1すればいい
	//0-indexで個数を求めるときはさらにindex+1する必要あり
	private static int lower_bound(long a[],long target) {
	//p(target+ " "+Arrays.toString(a));
	if(a[0]>target)return -1;
	//最後の値がtarget以下であるときは最後のindexを返す。
	//target以上が欲しいときは注意する必要あり
	if(a[a.length-1]<=target) return a.length-1;

	int S=-1;
	int E=a.length;

	while(S<E) {

		int G=(S+E)/2;
		if(G+1==a.length) {
			G--;
		}
		//未満にしたいときは=の場所を変える
		if(a[G]<=target&&a[G+1]>target) {
			return G;

		}else if(a[G]<=target){
			S=G;
		}else if(a[G]>target) {
			E=G;
		}

	}


	return -1;
	}
	static String nextPermutation(String s) {
		ArrayList<Character> list=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}
		int pivotPos=-1;
		char pivot=0;
		for(int i=list.size()-2;i>=0;i--) {
			if(list.get(i)<list.get(i+1)) {
				pivotPos=i;
				pivot=list.get(i);
				break;
			}
		}
		if(pivotPos==-1&&pivot==0) {
			return "Final";
		}
		int L=pivotPos+1,R=list.size()-1;



		int minPos=-1;
		char min =Character.MAX_VALUE;

		for(int i=R;i>=L;i--) {
			if(pivot<list.get(i)) {
				if(list.get(i)<min) {
					min=list.get(i);
					minPos=i;
				}
			}
		}

		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R+1));


		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
private static long[][] com;
private static void nCr() {
	int MAX = 3001;
	com= new long[MAX][MAX];
	for(int i = 0; i < MAX; i++)
	    com[i][0] = 1;
	for(int i = 1; i < MAX; i++) {
	    for(int j = 1; j <= i; j++) {
	        com[i][j] = com[i-1][j-1] + com[i-1][j];
	        com[i][j] %= mod;
	    }
	}
}


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


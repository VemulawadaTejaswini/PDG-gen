import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		/*
		 * しゃくとり
		 * 酷似した問題
		 * https://atcoder.jp/contests/tkppc2/tasks/tkppc2016_c
		 * 有給休暇
		 */
		int N=sc.nextInt();
		int K=sc.nextInt();
		String s=sc.next();
		int[] ary=new int[N];
		for(int i=0; i<N; i++) {
			if(s.charAt(i)=='1') {
				ary[i]=1;
			}
			else {
				ary[i]=0;
			}
		}
		ArrayList<Integer> kyuka=new ArrayList<Integer>();
		int tmp=0;
		int now=0;
		if(ary[0]==0) {
			now=-1;
			tmp=1;
		}
		else {
			now=1;
			tmp=1;
		}
		for(int i=1; i<N; i++) {
			if(now==1) {
				if(ary[i]==0) {
					now=-1;
					kyuka.add(tmp);
					tmp=1;
				}
				else {
					tmp++;
				}
			}
			else if(now==-1) {
				if(ary[i]==0) {
					tmp++;
				}
				else {
					now=1;
					kyuka.add(-tmp);
					tmp=1;
				}
			}
			/*if(ary[i]==1) {
				if(now==1) {
					tmp++;
				}
				else {
					kyuka.add(tmp);
					tmp=1;
					now=-1;
				}
			}
			else if(ary[i]==0) {
				if(now==-1) {
					tmp++;
				}
				else {
					kyuka.add(-tmp);
					tmp=1;
					now=1;
				}
			}*/
		}
		if(now==-1) {
			kyuka.add(-tmp);
		}
		else {
			kyuka.add(tmp);
		}
		int[] ary2=new int[kyuka.size()];
		for(int i=0; i<kyuka.size(); i++) {
			ary2[i]=kyuka.get(i);
		}
		/*for(int i=0; i<ary2.length; i++) {
			p(ary2[i]+" ");
		}
		pl();*/
		int right=0;
		int kaisu=0;
		int longest=0;
		tmp=0;
		for(int left=0; left<ary2.length; left++) {
			while(right<ary2.length && kaisu<=K) {
				if(ary2[right]>0) {
					tmp+=Math.abs(ary2[right]);
					right++;
				}
				else if(ary2[right]<0) {
					if(kaisu<K) {
						tmp+=Math.abs(ary2[right]);
						right++;
						kaisu++;
					}
					else {
						break;
					}
				}
			}
			longest=Math.max(longest,tmp);
			//pl(left+" "+right+" "+tmp);
			if(right==left) {
				right++;
			}else {
				if(ary2[left]<0) {
					kaisu--;
					tmp-=Math.abs(ary2[left]);
				}
				else if(ary2[left]>0) {
					tmp-=Math.abs(ary2[left]);
				}
			}
		}
		pl(longest);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}

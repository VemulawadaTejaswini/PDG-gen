import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int[] doubutu=new int[N];
		String s=sc.next();
		for(int i=0; i<N; i++) {
			if(s.charAt(i)=='o') {
				doubutu[i]=1;
			}
			else {
				doubutu[i]=0;
			}
		}
		int[] hako=new int[N];

		//最初0番目ををヒツジだと仮定して始める	決め打ち
		hako[0]=0;
		if(doubutu[0]==0) {	//xの時
			hako[1]=1;
			hako[N-1]=0;
		}
		else if(doubutu[0]==1) {	//Oのとき
			hako[1]=0;
			hako[N-1]=0;
		}
		for(int j=1; j<N-2; j++) {
			if(hako[j]==0) {	//ヒツジ
				if(doubutu[j]==0) {	//左右異なる　ｘ
					hako[j+1]=1-hako[j-1];
				}
				else {
					if(doubutu[j]==1) {	//左右同じ
						hako[j+1]=hako[j-1];
					}
				}
			}
			else if(hako[j]==1) {	//おおかみ
				if(doubutu[j]==0) {	//左右おなじ
					hako[j+1]=hako[j-1];
				}
				else {
					if(doubutu[j]==1) {	//左右異なる
						hako[j+1]=1-hako[j-1];
					}
				}
			}
		}
		boolean kotae=parity(doubutu,hako,N);
		if(kotae) {
			putans(hako,N);
		}
		else {
			hako=new int[N];

			//最初0番目ををヒツジだと仮定して始める	決め打ち
			hako[0]=0;
			if(doubutu[0]==0) {	//xの時
				hako[1]=0;
				hako[N-1]=1;
			}
			else if(doubutu[0]==1) {	//Oのとき
				hako[1]=1;
				hako[N-1]=1;
			}
			for(int j=1; j<N-2; j++) {
				if(hako[j]==0) {	//ヒツジ
					if(doubutu[j]==0) {	//左右異なる　ｘ
						hako[j+1]=1-hako[j-1];
					}
					else {
						if(doubutu[j]==1) {	//左右同じ
							hako[j+1]=hako[j-1];
						}
					}
				}
				else if(hako[j]==1) {	//おおかみ
					if(doubutu[j]==0) {	//左右おなじ
						hako[j+1]=hako[j-1];
					}
					else {
						if(doubutu[j]==1) {	//左右異なる
							hako[j+1]=1-hako[j-1];
						}
					}
				}
			}
			kotae=parity(doubutu,hako,N);
			if(kotae) {
				putans(hako,N);
			}
			else {
				/////////////////////////////////////////////
				hako=new int[N];

				//最初0番目ををオオカミだと仮定して始める	決め打ち
				hako[0]=1;
				if(doubutu[0]==0) {	//xの時
					hako[1]=1;
					hako[N-1]=1;
				}
				else if(doubutu[0]==1) {	//Oのとき
					hako[1]=0;
					hako[N-1]=1;
				}
				for(int j=1; j<N-2; j++) {
					if(hako[j]==0) {	//ヒツジ
						if(doubutu[j]==0) {	//左右異なる　ｘ
							hako[j+1]=1-hako[j-1];
						}
						else {
							if(doubutu[j]==1) {	//左右同じ
								hako[j+1]=hako[j-1];
							}
						}
					}
					else if(hako[j]==1) {	//おおかみ
						if(doubutu[j]==0) {	//左右おなじ
							hako[j+1]=hako[j-1];
						}
						else {
							if(doubutu[j]==1) {	//左右異なる
								hako[j+1]=1-hako[j-1];
							}
						}
					}
				}
				kotae=parity(doubutu,hako,N);
				if(kotae) {
					putans(hako,N);
				}
				else {
					/////////////////////////////////////
					hako=new int[N];

					//最初0番目ををおおかみだと仮定して始める	決め打ち
					hako[0]=1;
					if(doubutu[0]==0) {	//xの時
						hako[1]=0;
						hako[N-1]=0;
					}
					else if(doubutu[0]==1) {	//Oのとき
						hako[1]=1;
						hako[N-1]=0;
					}
					for(int j=1; j<N-2; j++) {
						if(hako[j]==0) {	//ヒツジ
							if(doubutu[j]==0) {	//左右異なる　ｘ
								hako[j+1]=1-hako[j-1];
							}
							else {
								if(doubutu[j]==1) {	//左右同じ
									hako[j+1]=hako[j-1];
								}
							}
						}
						else if(hako[j]==1) {	//おおかみ
							if(doubutu[j]==0) {	//左右おなじ
								hako[j+1]=hako[j-1];
							}
							else {
								if(doubutu[j]==1) {	//左右異なる
									hako[j+1]=1-hako[j-1];
								}
							}
						}
					}
					kotae=parity(doubutu,hako,N);
					if(kotae) {
						putans(hako,N);
					}
					else {
						pl(-1);
						System.exit(0);
					}
				}
			}
		}
	}
	public static boolean parity(int[] doubutu,int[] hako,int N) {
		boolean ok=true;
		for(int i=0; i<N; i++) {		//パリティ
			if(hako[(i+N)%N]==0) {	//ひつじ
				if(doubutu[(i+N)%N]==0) {	//ｘのとき
					if(hako[(i+N-1)%N]==hako[(i+N+1)%N]){
						ok=false;
						break;
					}
				}
				else if(doubutu[(i+N)%N]==1) {	//oのとき
					if(hako[(i+N-1)%N]!=hako[(i+N+1)%N]){
						ok=false;
						break;
					}
				}
			}
			else if(hako[(i+N)%N]==1) {	//ookm
				if(doubutu[(i+N)%N]==0) {	//ｘのとき
					if(hako[(i+N-1)%N]!=hako[(i+N+1)%N]){
						ok=false;
						break;
					}
				}
				else if(doubutu[(i+N)%N]==1) {	//oのとき
					if(hako[(i+N-1)%N]==hako[(i+N+1)%N]){
						ok=false;
						break;
					}
				}
			}
		}
		return ok;
	}
	public static void putans(int[] hako ,int N) {
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<N; i++) {
			if(hako[i]==0) {
				sb.append("S");
			}
			else {
				sb.append("W");
			}
		}
		pl(sb.toString());
		System.exit(0);
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
}
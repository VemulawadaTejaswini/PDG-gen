import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		MScanner sc = new MScanner(System.in);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		long k=sc.nextInt();
		int fx=sc.nextInt();int fy=sc.nextInt();
		int sum=Math.abs(fx+fy);
		if((sum+k)%2==1) {
			pw.println(-1);
		}
		else {
			int c=1;LinkedList<Integer>ans=new LinkedList<Integer>();
			ans.addFirst(fy);ans.addFirst(fx);
			if(fx+fy>0) {
				while(fx+fy>=2*k) {
					long dif=k/2;
					fx-=dif;fy-=(k-dif);
					ans.addFirst(fy);ans.addFirst(fx);c++;
				}
			}
			else {
				while(fx+fy<=-2*k) {
					long dif=k/2;
					fx+=dif;fy+=(k-dif);
					ans.addFirst(fy);ans.addFirst(fx);c++;
				}
			}
			long d=Math.abs(k-(fx+fy));
			//System.out.println(d);
			if(fx+fy>0) {
				long a;long b;
				if((d+k)%2==0) {
					a=(d+k)/2;b=a-d;
				}
				else {
					d=k-d;
					if((d+k)%2==0) {
						a=(d+k)/2;b=a-d;
					}
					else {
						a=-1;b=-1;
						pw.println(-1);pw.flush();return;
					}
				}
				if(fy>0 && fx<0) {
					fx+=b;fy-=a;
					
				}
				else {
					fy+=b;fx-=a;
				}
				ans.addFirst(fy);ans.addFirst(fx);c++;
			}
			else {
				if(fx+fy<0) {
					long a;long b;
					if((d+k)%2==0) {
						a=(d+k)/2;b=a-d;
					}
					else {
						d=k-d;
						if((d+k)%2==0) {
							a=(d+k)/2;b=a-d;
						}
						else {
							a=-1;b=-1;
							pw.println(-1);pw.flush();return;
						}
					}
					if(fy>0 && fx<0) {
						fx+=a;fy-=b;
						
					}
					else {
						fy+=a;fx-=b;
					}
					ans.addFirst(fy);ans.addFirst(fx);c++;
				}
			}
			if(fx==0 && fy==0) {
				
			}
			else {
				if(Math.abs(fx)+Math.abs(fy)==0 || Math.abs(fx)+Math.abs(fy)==k) {
					if((fx>0 && fy>0) || (fx<0 && fy<0) || Math.abs(fx)+Math.abs(fy)==k) {
						
					}
					else {
						if(fx<0 && fy>0) {
							fx+=k;
							ans.addFirst(fy);ans.addFirst(fx);c++;
						}
						else {
							if(fy<0 && fx>0) {
								fy+=k;
								ans.addFirst(fy);ans.addFirst(fx);c++;
							}
						}
					}
				}
				else {
					if(fx<0 && fy>0) {
						fx+=k;
						ans.addFirst(fy);ans.addFirst(fx);c++;
					}
					else {
						if(fy<0 && fx>0) {
							fy+=k;
							ans.addFirst(fy);ans.addFirst(fx);c++;
						}
					}
				}
				
			}
			pw.println(c);
			while(!ans.isEmpty()) {
				pw.println(ans.removeFirst()+" "+ans.removeFirst());
			}
		}
		pw.close();
		pw.flush();
 
	}
	static int gcd(int a, int b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
    static class MScanner {
		StringTokenizer st;
		BufferedReader br;
 
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
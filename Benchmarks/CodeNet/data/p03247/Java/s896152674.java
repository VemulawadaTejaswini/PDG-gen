//package may2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream(System.out);
		
		int n =scn.nextInt();
		
		
		int par = -1;
		int x[] = new int[n],y[] = new int[n];
		boolean ok = true;
		for(int i=0;i<n;i++) {
			x[i] =scn.nextInt();
			y[i] = scn.nextInt();
			
			if(i==0) {
				par = Math.abs(x[0]-y[0])%2;
			}else {
				if(par!=Math.abs(x[0]-y[0])%2) {
					ok = false;
				}
			}
		}
		if(!ok) {
			out.write("-1\n".getBytes());
			out.close();
			System.exit(0);
		}
		
		int m=0;
		long[] d;
		if(Math.abs(x[0]-y[0])%2==1) {
			m=33;
			d= new long[m];
			for(int i=0;i<m;i++) {
				d[i] = 1l<<i;
			}
		}else {
			m=34;
			d = new long[m];
			for(int i=0;i<m-1;i++) {
				d[i+1]=1L<<i;
				d[0]=1;
			}
		}
		out.write((m+"\n").getBytes());
		for(int i=0;i<m;i++) {
			out.write((d[m-i-1]+" ").getBytes());
		}
		out.write("\n".getBytes());
		
		for(int i=0;i<n;i++) {
			StringBuilder s = new StringBuilder();
			long X = x[i],Y=y[i];
			for(int j=m-1;j>=0;j--) {
				if(Math.abs(X)>Math.abs(Y)) {
					if(X<0) {
						s.append('L');
						X+=d[j];
					}else {
						s.append('R');
						X-=d[j];
					}
				}else {
					if(Y<0) {
						s.append('D');
						Y+=d[j];
					}else {
						s.append('U');
						Y-=d[j];
					}
				}
			}
			out.write((s.toString()+"\n").getBytes());
		}
		out.close();
	}
	static int mod(int x, int y) {
		int ans =x%y;
		if(ans<0) {
			ans+=y;
		}
		return ans;
	}
	static int lowerBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				//if (a[c] > x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
 
	static int upperBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
 
	static int lowerBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
 
	static int upperBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
 
	static int lowerBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
 
	static int upperBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}
 
	static <T> int lowerBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) >= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) >= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) >= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:Arey Maa chudi padi hai", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}
 
	static <T> int upperBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) > 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) > 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) > 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:Arey Maa chudi padi hai", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}
 
	static <T> int rupperBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) < 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) < 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) < 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:Arey maa chudi padi hai", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}
 
	static <T> int rlowerBound(List<T> ls, T x) {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) <= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) <= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) <= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:Arey maa chudi padi hai", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}

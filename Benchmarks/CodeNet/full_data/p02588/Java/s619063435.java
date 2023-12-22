import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
	static int n;
	static rep d[];
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		n = sc.nextInt();
		double a[] =new double[n];
		d = new rep[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextDouble();
			d[i] = convert(a[i]);
		}
		int numInt = 0;
		int maxX = -20;
		int minX = 1000;
		int maxY = -20;
		int minY = 1000;
		for(int i=0;i<n;i++) {
			if(d[i].x>=0 && d[i].y>=0) {
				numInt++;
				
			}
			maxX = Math.max(maxX, d[i].x);
			minX = Math.min(minX, d[i].x);
			maxY = Math.max(maxY, d[i].y);
			minY = Math.min(minY, d[i].y);
		}
		long lookUp[][] = new long[maxX-minX+1][maxY-minY+1];
		for(int i=minX;i<=maxX;i++) {
			for(int j=minY;j<=maxY;j++) {
				long temp = solve(i,j);
				lookUp[i-minX][j-minY] = temp;
			}
			
		}
		long res = 0;
		for(int i=0;i<n;i++) {
			res+=lookUp[d[i].x-minX][d[i].y-minY];
		}
		res-=numInt;
		res/=2;
		System.out.println(res);

	}
	static long solve(int a,int b) {
		long cnt = 0;
		for(int i=0;i<n;i++) {
			if(d[i].x>=-a && d[i].y>=-b) {
				cnt++;
			}
		}
		return cnt;
	}
	static rep convert(double k) {
		BigDecimal d = BigDecimal.valueOf(k);
		BigDecimal mult = BigDecimal.valueOf(1000000000);
		d = d.multiply(mult);
		BigInteger x = d.toBigInteger();
		int a =0;
		BigInteger two = BigInteger.valueOf(2);
		BigInteger five = BigInteger.valueOf(5);
		while(x.remainder(two).compareTo(BigInteger.ZERO)==0){
			a++;
			x = x.divide(two);
		}
		int b =0;
		while(x.remainder(five).compareTo(BigInteger.ZERO)==0) {
			b++;
			x = x.divide(five);
		}
		rep ret = new rep();
		a-=9;
		b-=9;
		ret.c = x;
		ret.x = a;
		ret.y = b;
		
		return ret;
	}
	public static class rep{
		
		BigInteger c;
		int x,y;
		
	}
	public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
 
 
    }
}

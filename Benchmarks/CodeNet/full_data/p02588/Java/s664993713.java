import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



class FastScanner {
    private Reader input;
    
    public FastScanner() {this(System.in);}
    public FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
    public void close() {
        try {
            this.input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public int nextInt() {return (int) nextLong();}
    
    public long nextLong() {
        try {
            int sign = 1;
            int b = input.read();
            while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                b = input.read();
            }
            if (b == '-') {
                sign = -1;
                b = input.read();
            } else if (b == '+') {
                b = input.read();
            }
            long ret = b - '0';
            while (true) {
                b = input.read();
                if (b < '0' || '9' < b) return ret * sign;
                ret *= 10;
                ret += b - '0';
            }
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public double nextDouble() {
        try {
            double sign = 1;
            int b = input.read();
            while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                b = input.read();
            }
            if (b == '-') {
                sign = -1;
                b = input.read();
            } else if (b == '+') {
                b = input.read();
            }
            double ret = b - '0';
            while (true) {
                b = input.read();
                if (b < '0' || '9' < b) break;
                ret *= 10;
                ret += b - '0';
            }
            if (b != '.') return sign * ret;
            double div = 1;
            b = input.read();
            while ('0' <= b && b <= '9') {
                ret *= 10;
                ret += b - '0';
                div *= 10;
                b = input.read();
            }
            return sign * ret / div;
        } catch (IOException e) {
            e.printStackTrace();
            return Double.NaN;
        }
    }
    
    public char nextChar() {
        try {
            int b = input.read();
            while (Character.isWhitespace(b)) {
                b = input.read();
            }
            return (char) b;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public String nextStr() {
        try {
            StringBuilder sb = new StringBuilder();
            int b = input.read();
            while (Character.isWhitespace(b)) {
                b = input.read();
            }
            while (b != -1 && !Character.isWhitespace(b)) {
                sb.append((char) b);
                b = input.read();
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public String nextLine() {
        try {
            StringBuilder sb = new StringBuilder();
            int b = input.read();
            while (b != -1 && b != '\n') {
                sb.append((char) b);
                b = input.read();
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public int[] nextIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = nextInt();
        }
        return res;
    }
    
    public int[] nextIntArrayDec(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = nextInt() - 1;
        }
        return res;
    }
    
    public int[] nextIntArray1Index(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i < n; i++) {
            res[i + 1] = nextInt();
        }
        return res;
    }
    
    public long[] nextLongArray(int n) {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nextLong();
        }
        return res;
    }
    
    public long[] nextLongArrayDec(int n) {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nextLong() - 1;
        }
        return res;
    }
    
    public long[] nextLongArray1Index(int n) {
        long[] res = new long[n + 1];
        for (int i = 0; i < n; i++) {
            res[i + 1] = nextLong();
        }
        return res;
    }
    
    public double[] nextDoubleArray(int n) {
        double[] res = new double[n];
        for (int i = 0; i < n; i++) {
            res[i] = nextDouble();
        }
        return res;
    }
}



class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}
	
	long pow(long a,long n) {
		return n!=0?pow(a*a,n/2)*(n%2==1?a:1):1;
	}
	
	int[] f(long a) {
		int[] ret=new int[2];
		while (a%2==0) {
			ret[0]++;
			a/=2;
		}
		while (a%5==0) {
			ret[1]++;
			a/=5;
		}
		ret[0]=Math.max(ret[0], 8);
		ret[0]=Math.max(ret[1], 8);
		return ret;
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String[] str=new String[N];
		for (int i=0;i<N;++i) {
			str[i]=sc.next();
		}
		solve(N, str);
//		gen();
	}
	
	void gen() {
		Random rnd=new Random();
		while (true) {
			int N=3;
			String[] str=new String[N];
			for (int i=0;i<N;++i) {
				double d=rnd.nextFloat();
				while (true) {
					if (d<1e4) {
						String[] tmp=String.valueOf(d).split("\\.");
						if (tmp.length==1) break;
						if (tmp.length==2 && tmp[1].length()>9) {
							tmp[1]=tmp[1].substring(0, 9);
							d=Double.valueOf(tmp[0]+"."+tmp[1]);
							str[i]=tmp[0]+"."+tmp[1];
							break;
						}
					}
					d=rnd.nextFloat();
				}
			}
			solve(N,str);
			System.out.println("ok");
		}
	}

	void solve(int N,String[] str) {
		Scanner sc = new Scanner(System.in);
		long[][][][] cnt=new long[9][9][10][10];
		for (int i=0;i<N;++i) {
			String[] strs=str[i].split("\\.");
			int c=strs.length==1?0:strs[1].length();
			long A=Long.valueOf(strs[0]+(strs.length==1?"":strs[1]));
			long num=A;
			long den=pow(10,c);
			long gcd=gcd(num,den);
			num/=gcd;
			den/=gcd;
			int[] p=f(num);
			int[] q=f(den);
			cnt[p[0]][p[1]][q[0]][q[1]]++;
		}
		
		long ans=0;
		for (int i=0;i<9;++i) {
			for (int j=0;j<9;++j) {
				for (int k=0;k<10;++k) {
					for (int l=0;l<10;++l) {
						if (cnt[i][j][k][l]==0) continue;
						for (int i2=k;i2<9;++i2) {
							for (int j2=l;j2<9;++j2) {
								for (int k2=0;k2<=i;++k2) {
									for (int l2=0;l2<=j;++l2) {
										if (cnt[i2][j2][k2][l2]==0) continue;
										if (i==i2&&j==j2&&k==k2&&l==l2) continue;
										ans+=cnt[i][j][k][l]*cnt[i2][j2][k2][l2];
									}
								}
							}
						}
					}
				}
			}
		}
		
		ans/=2;
		for (int i=0;i<5;++i) {
			for (int j=0;j<5;++j) {
				long d=cnt[i][j][0][0];
				if (d==0) continue;
				ans+=d*(d-1)/2;
			}
		}
		
		System.out.println(ans);
		
	}	
	
	

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

}

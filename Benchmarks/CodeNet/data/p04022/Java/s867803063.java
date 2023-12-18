import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	public static long[] primes = new long[9592];
	public static long[] squares = new long[9592];
	public static long[] cubes = new long[9592];

	private static class Pair {
		long red;
		int a;
		public Pair(long v) {
			red = v;
			a = 1;
		}
	}
	public static void main(String args[]) {
		Sc sc = new Sc(System.in);
		int n = sc.nI();
		
		int ind = 0;
		primes[ind] = 2;
		squares[ind] = 4;
		cubes[ind++] = 8;
		for(long i = 3; i<=100000; i+=2) {
			long sqrt = (long) Math.sqrt(i);
			boolean prime = true;
			for(int j = 1; j<ind; j++) {
				long p = primes[j];
				if(p>sqrt) break;
				if(i%p == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				primes[ind] = i;
				squares[ind] = i*i;
				cubes[ind++] = i*i*i;
			}
		}
		FHMap map = new FHMap(1280023);
		Pair[] pairs = new Pair[n];
		int indp = 0;
		for(int i = 0; i<n; i++) {
			long v = reduce(sc.nL());
			Pair p = map.get(v);
			if(p!=null) {
				p.a++;
			} else {
				p = new Pair(v);
				map.put(new P(v,p));
				pairs[indp++] = p;
			}
		}

		HashSet<Long> set = new HashSet<>(300007);
		int picked = 0;
		for(int i = 0; i<indp; i++) {
			Pair p = pairs[i];
			if(p.red == 1) {
				picked++;
				continue;
			}
			try {
			if(!set.contains(p.red)) {
				long inv = inv(p.red);
				int max = p.a;
				if(inv != -1) {
					Pair pp = map.get(inv);
					if(pp != null) {
						max = Math.max(max,pp.a);
						set.add(inv);
					}
				}
				picked+=max;
			}
			}catch(Exception e) {}
		}
		System.out.println(picked);
	}
	public static long inv(long v) {
		long ret = 1;
		long div = 1;
		for(int i = 0; i<primes.length; i++) {
			long p = primes[i];
			long sq = squares[i];
			if(sq*div>v) break;
			if(v%sq == 0) {
				ret *= p;
				div *= sq;
			} else if(v%p == 0) {
				ret *= sq;
				div *= p;
			}
			if(ret>10000000000L) return -1;
		}
		v /= div;
		return (Math.log(ret) + 2*Math.log(v) >= 24) ? -1 : ret*v*v;
	}
	public static long reduce(long v) {
		for(int i = 0; i<326; i++) {
			long cube = cubes[i];
			if(cube>v) break;
			while(v%cube == 0) {
				v/=cube;
			}
		}
		return v;
	}
	private static class FHMap {
		P[] map;
		long mod;
		int size = 0;
		
		public FHMap(int mod){
			map = new P[mod];
			this.mod = mod;
		}
		
		public void put(P p) {
			int w = (int) (p.k%mod);
			while(true) {
				if(map[w] == null) {
					map[w] = p;
					size++;
					return;
				} else if(map[w].k == p.k) {
					map[w] = p;
					return;
				}
				w = (int) ((w + 1)%mod);
			}
		}
		public Pair get(long k) {
			int w = (int) (k%mod);
			while(true) {
				if(map[w] == null) {
					return null;
				} else if(map[w].k == k) {
					return map[w].v;
				}
				w = (int)((w + 1)%mod);
			}
		}
	}
	private static class P {
		long k;
		Pair v;
		public P(long k, Pair v) {
			this.k = k;
			this.v = v;
		}
	}
}

class Sc {
    public Sc(InputStream i) {
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasM() {
        return peekToken() != null;
    }

    public int nI() {
        return Integer.parseInt(nextToken());
    }

    public double nD() { 
        return Double.parseDouble(nextToken());
    }

    public long nL() {
        return Long.parseLong(nextToken());
    }

    public String n() {
        return nextToken();
    }

    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null) 
            try {
                while (st == null || !st.hasMoreTokens()) {
                    line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}
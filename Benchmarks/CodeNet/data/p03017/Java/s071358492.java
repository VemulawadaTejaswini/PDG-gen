import java.util.*;

public class Main {
	static int mod = 1000000007;
  static int size = 200000;
	static long[] fac = new long[size];
	static long[] finv = new long[size];
	static long[] inv = new long[size];
	static int INF = Integer.MAX_VALUE;

 	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt()-1;
		int b = scanner.nextInt()-1;
		int c = scanner.nextInt()-1;
		int d = scanner.nextInt()-1;
		String s = scanner.next();
		for(int i = 0; i < n-1; i++){
			if(s.charAt(i) == '#' && s.charAt(i+1) == '#' && i < c){
				System.out.println("No");
				return;
			}
		}
		for(int i = 0; i < n-1; i++){
			if(s.charAt(i) == '#' && s.charAt(i+1) == '#' && i < d){
				System.out.println("No");
				return;
			}
		}
		if(a > b){
			System.out.println("Yes");
			return;
		}
		if(s.charAt(b-1) == '.' && s.charAt(b+1) == '.'){
			System.out.println("Yes");
			return;
		}
		if(b-1 == a && s.charAt(b+1) == '.'){
			System.out.println("Yes");
			return;
		}
		for(int i = b; i < n-2; i++){
			if(s.charAt(i) == '.' && s.charAt(i+1) == '.' && s.charAt(i+2) == '.'){
				System.out.println("Yes");
				return;
			}
		}
		if(d > c){
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
	public static class Edge{
		int to;
		Edge(int to){
			this.to = to;
		}
	}
	public static void swap(long a, long b){
		long tmp = 0;
		if(a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
	}
  static class Pair implements Comparable<Pair>{
    int first, second;
    Pair(int a, int b){
        first = a;
        second = b;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair p = (Pair) o;
        return first == p.first && second == p.second;
    }
    @Override
    public int compareTo(Pair p){
        //return first == p.first ? second - p.second : first - p.first; //firstで昇順にソート
        //return (first == p.first ? second - p.second : first - p.first) * -1; //firstで降順にソート
        return second == p.second ? first - p.first : second - p.second;//secondで昇順にソート
        //return (second == p.second ? first - p.first : second - p.second)*-1;//secondで降順にソート
    }
  }

  //繰り返し二乗法
  public static long pow(long x, long n){
    long ans = 1;
    while(n > 0){
      if((n & 1) == 1){
        ans = ans * x;
        ans %= mod;
      }
      x = x * x % mod;
      n >>= 1;
    }
    return ans;
  }

	public static long div(long x, long y){
		return (x*pow(y, mod-2))%mod;
	}

  //fac, inv, finvテーブルの初期化、これ使う場合はinitComb()で初期化必要
	public static  void initComb(){
		fac[0] = finv[0] = inv[0] = fac[1] = finv[1] = inv[1] = 1;
		for (int i = 2; i < size; ++i) {
			fac[i] = fac[i - 1] * i % mod;
			inv[i] = mod - (mod / i) * inv[(int) (mod % i)] % mod;
			finv[i] = finv[i - 1] * inv[i] % mod;
		}
	}

	//nCk % mod
	public static long comb(int n, int k){
		return fac[n] * finv[k] % mod * finv[n - k] % mod;
	}

	//n! % mod
	public static long fact(int n){
		return fac[n];
	}

	//(n!)^-1 with % mod
	public static long finv(int n){
		return finv[n];
	}

  static class UnionFind {
    int[] parent;
    public UnionFind(int size) {
      parent = new int[size];
      Arrays.fill(parent, -1);
    }
    public boolean unite(int x, int y) {
      x = root(x);
      y = root(y);
      if (x != y) {
        if (parent[y] < parent[x]) {
          int tmp = y;
          y = x;
          x = tmp;
        }
        parent[x] += parent[y];
        parent[y] = x;
        return true;
      }
      return false;
    }
    public boolean same(int x, int y) {
      return root(x) == root(y);
    }
    public int root(int x) {
      return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
    }
    public int size(int x) {
      return -parent[root(x)];
    }
  }
	public static int upperBound(long[] array, long value) {
			 int low = 0;
			 int high = array.length;
			 int mid;
			 while( low < high ) {
					 mid = ((high - low) >>> 1) + low; // (high + low) / 2
					 if( array[mid] <= value ) {
							 low = mid + 1;
					 } else {
							 high = mid;
					 }
			 }
			 return low;
	 }
	 public static final int lowerBound(final long[] arr, final long value) {
    int low = 0;
    int high = arr.length;
    int mid;
    while (low < high) {
        mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
        if (arr[mid] < value) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return low;
}
  //n,mの最大公約数
  public static long gcd(long n, long m){
    if(m > n) return gcd(m,n);
    if(m == 0) return n;
    return gcd(m, n%m);
  }
	//3要素のソート
	private class Pair2 implements Comparable<Pair2> {
		String s;
		int p;
		int index;
		public Pair2(String s, int p, int index) {
				this.s = s;
				this.p = p;
				this.index = index;
		}

		public int compareTo(Pair2 other) {
				if (s.equals(other.s)) {
						return other.p - this.p;
				}
				return this.s.compareTo(other.s);
		}
	}
	//c -> intに変換
public static long c2i(char c){
	if('A' <= c && c <= 'Z'){
		return c - 'A';
	}else{
		return c - 'a' + 26;
	}
}
// int -> toに変換
public static char i2c(long i){
	if(0 <= i && i < 26){
			return (char)(i + 'A');
	}else{
			return (char)(i + 'a' - 26);
	}
}

}

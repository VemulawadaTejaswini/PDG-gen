public class Main {
	public static long mod = 1_000_000_007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		BigInteger[] a = new BigInteger[n];
		BigInteger gcd = BigInteger.ZERO, lcm = BigInteger.ONE;
		for(int i = 0; i < n; i++){
			a[i] = new BigInteger(sc.next());
		}
		sc.close();
		gcd = a[0];
		lcm = a[0];
		for(int i = 1; i < n; i++){
			gcd = lcm.gcd(a[i]);
			lcm = lcm.multiply(a[i]);
			lcm = lcm.divide(gcd);
		}
		BigInteger ans = BigInteger.ZERO, tmp = BigInteger.ZERO;
		for(int i = 0; i < n; i++){
			tmp = lcm.divide(a[i]);
			ans = ans.add(tmp);
		}
		System.out.println(ans.mod(BigInteger.valueOf(mod)));
	}
}

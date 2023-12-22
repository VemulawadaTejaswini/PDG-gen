import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		var a = new int[n];
		var counter = new BigInteger[100001];
		for(int i=0;i<counter.length;i++) {
			counter[i]=BigInteger.ZERO;
		}
		for(int i=0;i<a.length;i++) {
			var ae = sc.nextInt();
			counter[ae]=counter[ae].add(BigInteger.ONE);
		}
		var q = sc.nextInt();
		var b = new int[q];
		var c = new int[q];
		BigInteger sum = BigInteger.ZERO;
		for(int k=0;k<counter.length;k++) {
			if(!counter[k].equals(BigInteger.ZERO)) {
				sum = sum.add(BigInteger.valueOf(k).multiply(counter[k]));
			}
		}
		for(int i=0;i<q;i++) {
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		for(int i=0;i<q;i++) {
			if(!counter[b[i]].equals(BigInteger.ZERO)) {
				sum = sum.subtract(BigInteger.valueOf(b[i]).multiply(counter[b[i]]));
				sum = sum.add(BigInteger.valueOf(c[i]).multiply(counter[b[i]]));
				counter[c[i]] = counter[c[i]].add(counter[b[i]]);
				counter[b[i]] = BigInteger.ZERO;
			}
			System.out.println(sum);
		}
	}
}
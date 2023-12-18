import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		sc.close();
		sc = null;
		double nbunno1 = 1.0d / n;
		double kaku = 0.0d;
		int kai;
		double[] nibunnno1 = new double[18];
		double ni = 2.0d;
		for(i = 0; i <= 17; i++) {
			ni /= 2.0d;
			nibunnno1[i] = ni;
		}
//		int aa = 0;
		int max;
		if(n >= k) {
			max = k -1;
		} else {
			max = n;
		}
		for(i = 1; i <= max; i++) {
			kai = (int) Math.ceil(Math.log((double)k / i)/Math.log(2));
//			System.out.println(kai); /*  */
//			aa +=  Math.pow(2, 17-kai); 
			kaku += nbunno1 * nibunnno1[kai]; 
		}
//		System.out.println(kaku);
//		System.out.println((double)aa/n/131072);
		if(n >= k) {
			kaku += nbunno1 * (n - k + 1);
		}
//		System.out.println(nbunno1 * (n - k));
//		System.out.println(((double)aa/131072+(double)(n-k))/n);
		System.out.println(kaku);
	}
}

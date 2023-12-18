import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double p0 = 0.0;
		if(n >= k) {
			p0 = (n - (k-1));
		}
		
//		int a = 0;
//		int b = 1;
//		while(b < 100000) {
//			b *= 2;
//			a++;
//		}
//		System.out.println(a); // 17
//		System.out.println(Math.pow(2, 17));
		
		long sum = 0;
		for(int i = 1; i <= k-1; i++) {
			int x = i;
			int pow = 0;
			while(x < k) {
				x *= 2;
				pow++;
			}
			sum += Math.pow(2, 17-pow);
		}
		System.out.println((p0 + (double)(sum)/(double)(Math.pow(2, 17)))/n);
	}
}
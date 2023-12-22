import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		long x = sc.nextLong();
		
		long[] c = new long[n];
		long[][] a = new long[n][m];
		
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			for(int l = 0;  l < m; l++) {
				a[i][l] = sc.nextInt();
			}
		}
		
		long[] sum = new long[m];
		int kekka = 0;
		long price = 0;
		long min = -1;
		int num = 100000000;
		String nums = " ";
		while(true) {
			price = 0;
			num++;
			if(num-100000000 < 32) {nums = "0000000" + Integer.toBinaryString(num-100000000);}
			else {nums = "0000" + Integer.toBinaryString(num-100000000);}
			//System.out.println(nums);
			//System.out.println((char)nums.charAt(nums.length()) == '1');
			for(int i = 0; i < m; i++) {
				sum[i] = 0;
			}
			for(int i = 0; i < n; i++) {
				if((char)nums.charAt(nums.length()-i-1) == '1') {
					//System.out.println(c[i]);
					price += c[i];
					for(int k = 0; k < m; k++) {
						sum[k] += a[i][k];
					}
				}
			}
			for(int k = 0; k < m; k++) {
				//System.out.println(sum[k]);
				if(sum[k] < x) {
					kekka = -1;
					break;
				}
				if(k == m -1) {
					kekka = 1;
				}
			}
			if(kekka == 1 && (price < min || min == -1)) {
				min = price;
			}
			//System.out.println(Math.pow(2, n) + " "+num+" "+ price);
			if(num - 100000000== Math.pow(2, n)) {
				break;
			}
			
		}
			
		System.out.println(min);
			
			
			
			
			
		
		
	}
}
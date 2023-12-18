import java.util.ArrayList;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		 for(int i = 0 ; i < N; i++) {
			 nums.add(sc.nextInt());
			 }
		 int max = 100000000;
		 int cd =1;
		 int basis =1;
		 int ans = 1;
		 
		 for(int i = 0; i < N; i++) {
			 if(i != 0) {
				 basis = nums.get(0);
			 }else {
				 basis = nums.get(1);
			 }
			 for(int j = 0 ; j < N; j++) {
				 if(j != i) {
					 cd = gcd(basis, nums.get(j));
					 if(cd < max) {
						 	max = cd;
					 }
				 }
			 }
			 if(ans < max) {
				 ans = max;
			 }
			 max = 100000000;
		 }	
		System.out.println(ans);
	}

	public static int gcd(int n, int m) {
		int k = 1;
		if(m > n) {
			k = m;
			m = n;
			n = k;
		}
		while(true) {
		k = n % m;
		if(k == 0) {
			return m;
		}
		n = m;
		m = k;
		}
	}
}
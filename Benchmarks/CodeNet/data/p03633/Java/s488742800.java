import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long[] T = new long[n];

		long x=1L;
		for(int i = 0;i < n;i++){
			T[i]  = sc.nextLong();
		}
		Arrays.sort(T);

		for(int i = 0;i < n-1;i++){
			x = lcm(T[i], T[i+1]);
		}



		System.out.println(ans);

	}

	static long lcm (long a, long b) {
		
		if(a*b < Math.max(a, b)){
			return Math.max(a, b);
		}
		long temp = 1L;
		long c = (long)a;
		c *= (long)b;
		while((temp = a%b)!=0) {
			a = (long)b;
			b = (long)temp;
		}
		return (long)(c/b);
	}

}
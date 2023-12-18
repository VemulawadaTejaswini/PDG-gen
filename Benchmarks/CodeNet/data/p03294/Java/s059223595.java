import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long[]a = new long[N];
		long sum = 1;
		for(int i = 0;i < N;i++){
			a[i] = scan.nextInt();
			sum = lcm(a[i], sum);

		}



		long ans = 0;
		for(int i= 0;i < N;i++){
			ans += (sum-1)%a[i];

		}




		System.out.println(ans);

	}


	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c/b);
	}
}







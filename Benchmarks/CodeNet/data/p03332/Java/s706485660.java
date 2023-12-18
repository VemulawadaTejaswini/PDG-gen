import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();


		long Sum = 0;
		for(long i=0;i < k/a + 1;i++) {
			if((k-i*a)%b == 0) {
				long j = (k-i*a)/b;

				long Z = 0;
				long tmpI =i;


				while(tmpI >= 0 && j >=0) {
					if(n >= tmpI + j + Z) {
						Sum += stair(n)/(stair(tmpI)*stair(j)*stair(Z)*stair(n-tmpI-j-Z));
					}

					Sum = Sum % 998244353;

					tmpI -=1;
					j -=1;
					Z += 1;
				}
			}
		}



		System.out.println(Sum);

	}

	public static float stair(long n) {
		float back = 1;

		while(n>1) {
			back = back * n;
			n = n-1;
		}
		return back;
	}



}
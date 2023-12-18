import java.util.Scanner;

class Main{
	public static void main(String[]$){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double s = 0;
		for(int i = 1; i <= n; i++){

			int c = 0;
			if(i<k)
				for(int t = i; t < k; t *= 2)
					c++;

			s += (1.0000000000/n) * Math.pow(0.5000000000, c);
		}

		System.out.println(s);
	}
}

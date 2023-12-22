import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();
		long m = sc.nextLong();

		long a = x;
		long sum = a;


		for(int i=1;i<n;i++){
			a = func(a,m);
			sum += a;
		}

		System.out.println(sum);
	}


	private static long func(long a,long m){
		return (a * a) % m;
	}
}

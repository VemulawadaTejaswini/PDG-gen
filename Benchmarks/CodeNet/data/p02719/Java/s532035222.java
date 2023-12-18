import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long res1 = n % k;
		long res2 = k - n % k;
		if(res1 > res2){
			res1 = res2;
		}
		System.out.println(res1);
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long answer = 0;
		long warizan = n /(a + b);
		answer += (warizan * a);
		long amari = n % (a + b);
		if(amari >= a) {
			answer += a;
		}else {
			answer += amari;
		}
		System.out.println(answer);
	}
}
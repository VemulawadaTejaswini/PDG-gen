import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long count = n/11*2;
		n -= n/11*11;
		if(n<=6) count++;
		else count += 2;
		System.out.println(count);
		sc.close();
	}
}
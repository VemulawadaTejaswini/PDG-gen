import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		if(N%sumDegit(N)==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	static int sumDegit(long N) {
		int i = 0;
		long tmp = N;
		while(tmp>=10) {
			i += tmp % 10;
			tmp = tmp / 10;
		}
		i += tmp;
		return i;
	}
}

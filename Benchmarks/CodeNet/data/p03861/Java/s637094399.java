import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		if(x==1) {
			System.out.println(b-a+1);
			return;
		}
		long answer = (b /x) -((a-1) /x);
		System.out.println(answer);
	}
}
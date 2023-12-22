import java.util.Scanner;

public class Main {
	final static long limit = 1000000000000000000l;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		float B = sc.nextFloat();
		System.out.println(A*(int)(B*100)/100);
	}

}

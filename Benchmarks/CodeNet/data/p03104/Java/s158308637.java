import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(xor(b)^xor(a-1));
		sc.close();
	}
	public static long xor(long x) {
		if(x%2 == 0) {
			return ((x/2)%2)^x;
		}else {
			return ((x+1)/2)%2;
		}
	}
}
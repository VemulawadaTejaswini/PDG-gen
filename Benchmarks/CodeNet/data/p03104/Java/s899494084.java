import java.util.Scanner;

public class Main{
	static long f(long A) {
		if(A % 4 == 0) return A;
		if(A % 4 == 1) return 1;
		if(A % 4 == 2) return A + 1;
		return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong(), B = sc.nextLong();
		System.out.println(f(B) ^ f(A - 1));
	}
}
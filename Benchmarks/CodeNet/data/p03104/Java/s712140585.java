import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long sum = A;
		while(A<B) {
			A++;
			sum = sum^A;
		}
		System.out.println(sum);
	}
}
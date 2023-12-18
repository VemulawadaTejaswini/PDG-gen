import java.util.*;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long x = sc.nextInt();
		long count=0;
		long A=a/x;
		if(a%x==0) A--;
		long B =b/x;
		count=B-A;
		System.out.println(count);

	}

}

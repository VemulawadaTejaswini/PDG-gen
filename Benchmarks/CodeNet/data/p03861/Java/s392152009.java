import java.util.*;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long x = sc.nextInt();
		long count=0;
		for(long i=a;i<=b;i++) {
			if(i%x==0) {
				count = count +1;
			}
		}
		System.out.println(count);

	}

}

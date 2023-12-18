import java.util.*;
public class Main {
	private static Scanner sc;	 
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		Long x = sc.nextLong();
		Long count ;
		a=a-1;
		Long sum1 = a/x;
		long sum2 = b/x;
		count = sum2-sum1;
		System.out.println(count);
		
	}

}

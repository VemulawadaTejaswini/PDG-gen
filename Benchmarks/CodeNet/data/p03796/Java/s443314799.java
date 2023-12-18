
import java.util.*;	
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 1;
		for(long i = 1;i <= n;i++) {
			sum = (sum*i)%(1000000000+7);
		}
		System.out.println(sum);
		
		System.out.println(sum);
	}

}

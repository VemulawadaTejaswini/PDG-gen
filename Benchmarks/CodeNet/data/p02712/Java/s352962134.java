/**
 * 
 */
import java.util.Scanner;

/**
 * @author Neeraj
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long sum=0l;
		for(int i=1;i<=n;i++) {
			if(i%3==0||i%5==0)
				continue;
			else
				sum+=i;
		}
		System.out.println(sum);
	}

}

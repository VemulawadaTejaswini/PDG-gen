import java.util.Scanner;

public class Main {
	public static void main ( String[] args ) {
		int m , n , sum = 0 , ave = 0 , count = 0;
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			m = sc.nextInt();
			n = sc.nextInt();
			sum += m * n;
			count++;
		}
		ave = Math.round( sum / count );
		System.out.printf("%d\n%d\n",sum,ave);
	}
}
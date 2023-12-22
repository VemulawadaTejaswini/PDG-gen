import java.util.Scanner;

public class Main {
	public static void main ( String[] args ) {
		int m , n , sum = 0 , ave = 0 , count = 0;
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			m = sc.nextInt();
			if ( !sc.hasNext() ) break;
			n = sc.nextInt();
			sum += m * n;
			count++;
		}
		ave = Math.round((float)( sum / count ));
		System.out.println(sum+"\n"+ave);
	}
}
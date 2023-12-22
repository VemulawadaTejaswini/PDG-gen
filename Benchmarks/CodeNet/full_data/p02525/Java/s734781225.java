import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while( true ){
			int n = Integer.parseInt(scan.next());
			if( n <= 0 ){
				break;
			}
			int[] s = new int[n];
			int sum = 0;
			double ave = 0.0;
			double a = 0.0;
			for( int i = 0; i < n; i++ ){
				s[i] = Integer.parseInt(scan.next());
				sum += s[i];
			}
			ave = (double)sum / n;
			for( int i = 0; i < n; i++ ){
				a += Math.pow((s[i] - ave), 2);
			}
			a /= n;
			a = Math.sqrt(a);
			System.out.println(a);
		}
		return;
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = sc.next().split("");


		long r = 0;
		long g = 0;
		long b = 0;

		for (String str : s){
			if ( str.equals("R") ){
				r++;
			} else if ( str.equals("G") ) {
				g++;
			} else {
				b++;
			}

		}

		long total = r * g * b;

		long sum = 0;

		for ( int i = 0; i < n; i++){
			for ( int j = i+1; j < n; j++){

				if ( s[i].equals( s[j] ) ) continue;

				int k = j*2-i;

				if ( k >= n || s[k].equals( s[i] ) || s[k].equals( s[j] ) ) continue;

				sum++;

			}
		}
		System.out.println(total - sum);

	}

}

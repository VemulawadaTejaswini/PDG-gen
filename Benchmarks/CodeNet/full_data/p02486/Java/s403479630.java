import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt() , x = sc.nextInt();
			if ( n == 0 && x == 0 ) break;
			int count = 0;
			for ( int i = 3; i <= n; i++ )
				for ( int j = 2; j < i; j++ )
					for ( int k = 1; k < j; k++ )
						if ( i + j + k == x ) count++;
			System.out.println(count);
		}
	}
}
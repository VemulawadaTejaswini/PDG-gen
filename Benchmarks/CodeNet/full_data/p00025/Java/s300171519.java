import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			int h = 0 , b = 0;
			int[] data = new int[8];
			for ( int i = 0; i < 8; i++ )
				data[i] = sc.nextInt();
			for ( int i = 0; i < 4; i++ ) {
				if ( data[i] == data[i+4] )
					h++;
				else {
					for ( int j = 4; j < 8; j++ )
						if ( data[i] == data[j] ) b++;
				}
			}
			System.out.println(h+" "+b);
		}
	}
}
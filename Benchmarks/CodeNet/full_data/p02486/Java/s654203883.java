import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while( true ){
			int n = Integer.parseInt(scan.next());
			int x = Integer.parseInt(scan.next());
			int count = 0;	//?????¶????????´???????????°???
			if( n == 0 && x == 0 ){
				break;
			}
			for( int i = 1; i <= n - 2; i++ ){
				for( int j = i + 1 ; j <= n - 1; j++ ){
					for( int k = j + 1; k <= n; k++ ){
						if( i + j + k == x ){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
		return;
	}
}
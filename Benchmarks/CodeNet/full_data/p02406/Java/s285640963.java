import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		call(Integer.parseInt(scan.next()));
		return;
	}
	
	public static void call(int n){
		int i = 1;
		while( ++i <= n ){
			int x = i;
			if( x % 3 == 0 ){
				System.out.printf(" %d", i);
			}else{
				for( int j = 0; x != 0; j++ ){
					if( x % 10 == 3 ){
						System.out.printf(" %d", i);
						break;
					}else{
						x /= 10;
					}
				}
			}
		}
		System.out.println();
		return;
	}
}
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] mass = new char[H+2][W+2];
		for( int i=0; i<=H+1; i++ ){
			for( int j=0; j<=W+1; j++ ){
				mass[i][j] = '?';
			}
		}
		for( int i=1; i<=H; i++ ){
			String ss = sc.next();
			for( int j=1; j<=W; j++ ){
				mass[i][j] = ss.charAt(j-1);
			}
		}
		loop:for( int i=1; i<=H; i++ ){
			for( int j=1; j<=W; j++ ){
				if( mass[i][j]=='#' ){
					if( mass[i-1][j]!='#' && mass[i+1][j]!='#' && mass[i][j-1]!='#' && mass[i][j+1]!='#' ){
						System.out.println("No");
						break loop;
					}
				}
			}
			if( i==H ){
				System.out.println("Yes");
				break loop;
			}
		}
	}
}

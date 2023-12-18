import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] A = new char[H][W];
		int[] hh = new int[H];
		int[] ww = new int[W];
		for( int i=0; i<H; i++ ){
			int a = 0;
			String S = sc.next();
			for( int k=0; k<W; k++ ){
				A[i][k] = S.charAt(k);
				if( A[i][k]=='#' ){
					a = 1;
				}
			}
			if( a==0 ){
				hh[i] = 1;
			}
		}
		for( int i=0; i<W; i++ ){
			int a = 0;
			for( int k=0; k<H; k++ ){
				if( A[k][i]=='#' ){
					a = 1;
				}
			}
			if( a==0 ){
				ww[i] = 1;
			}
		}
		for( int i=0; i<H; i++ ){
			if( hh[i]==1 ){
				continue;
			}
			for( int k=0; k<W; k++ ){
				if( ww[k]==1 ){
					continue;
				}
				if( k==W-1 ){
					System.out.println(A[i][k]);
				}else{
					System.out.print(A[i][k]);
				}
			}
		}
	}
}

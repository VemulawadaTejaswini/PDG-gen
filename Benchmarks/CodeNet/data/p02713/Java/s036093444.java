import java.util.*;
import java.lang.*;

public class Main{
  
  public static int gcd( int x,int y ){
	if( y>0 ){
		return gcd(y,x%y);
	}else{
		return x;
	}
}
  
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int ans = 0;
		for( int i=1; i<=K; i++ ){
			for( int j=1; j<=K; j++ ){
				for( int k=1; k<=K; k++ ){
					ans += gcd( i, gcd(j,k) );
				}
			}
		}
		System.out.println(ans);
	}
}
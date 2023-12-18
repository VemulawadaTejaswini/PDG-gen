import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] Pa = new int[a+1];
		int[] Pb = new int[b+1];
		int c = 0,d = 0;
		while( c==0 ){
			for( int i=2; i*i<=a; i++ ){
				if( a%i==0 ){
					Pa[i]++;
					a = a/i;
					break;
				}
				if( (i+1)*(i+1)>a ){
					Pa[a]++;
					c = 1;
				}
			}
		}
		while( d==0 ){
			for( int i=2; i*i<=b; i++ ){
				if( b%i==0 ){
					Pb[i]++;
					b = b/i;
					break;
				}
				if( (i+1)*(i+1)>b ){
					Pb[b]++;
					d = 1;
				}
			}
		}
		long ans = 1;
		for( int i=1; i<=Math.max(a,b); i++ ){
			if( Pa[i]>0 || Pb[i]>0 ){
				if( Pa[i]>=Pb[i] ){
					for( int j=0; j<Pa[i]; j++ ){
						ans = ans*i;
					}
				}else{
					for( int j=0; j<Pb[i]; j++ ){
						ans = ans*i;
					}
				}
			}
		}
		if( ans==0 ){
			ans = a*b;
		}
		System.out.println(ans);
	}
}

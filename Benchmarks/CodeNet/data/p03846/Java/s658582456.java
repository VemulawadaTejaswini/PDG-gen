import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] an = new int[n];
		int sameNum = 0;
 
		for( int i=0; i<n; i++ ){
			an[i]=sc.nextInt();
		}
		Arrays.sort(an);

		if( n%2 == 1 && an[0] != 0 ){
			System.out.println(0);
			return;
		}
		for( int i=(n-1); i>0; i-=2 ){
			if(an[i-1] != an[i]){
				System.out.println(0);
				return;
			}
		}
			
		System.out.println( Math.floorMod( (long)Math.pow(2.0,n/2),((long)Math.pow(10.0,9.0)+7) ));
                return;
	}
}
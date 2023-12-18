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

		if( n%2 == 1 && an[n-1] != 0 ){
			System.out.println(0);
			return;
		}
		for( int i=n/2; i>0; i-- ){
			if(an[2*(i-1)] != an[2*i-1]){
				System.out.println(0);
				return;
			}
			sameNum++;
		}
		System.out.println( Math.floorMod( (long)Math.pow(2.0,sameNum),((long)Math.pow(10.0,9.0)+7) ));
                return;
	}
}
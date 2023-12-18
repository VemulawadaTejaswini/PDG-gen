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

		for( int i=0; i<n; i+=2 ){
			if( (an[i] != an[i+1])||
			    (an[i] == 0 && i!=n-1) ){
				System.out.println(0);
				return;
			}
			sameNum++;
		}
		System.out.println( Math.floorMod( (long)Math.pow(2.0,sameNum),((long)Math.pow(10.0,9.0)+7) ));
                return;
	}
}
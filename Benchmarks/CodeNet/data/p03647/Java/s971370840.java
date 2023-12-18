import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		int count1 = 0,count2 = 0;
		int[] fromOne = new int[M];
		int[] toN = new int[M];      
		for( int i=0; i<M; i++ ){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if( a[i]==1 ){
				fromOne[count1] = b[i];
				count1++;
            }
			if( b[i]==N ){
				toN[count2] = a[i];
				count2++;              
            }              
		}
		loop:for( int i=0; i<count1; i++ ){
			for( int j=0; j<count2; j++ ){          
				if( fromOne[i]==toN[j] ){
					System.out.println("POSSIBLE");
					break loop;
				}
            }              
			if( i==count1-1 ){
				System.out.println("IMPOSSIBLE");
			}
		}
	}
}

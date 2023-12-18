import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] bou = new int[N];
		for( int i=0; i<N; i++ ){
			bou[i]=sc.nextInt();
		}
		Arrays.sort(bou);        
		int count=0;
		for( int i=0; i<N-2; i++ ){
			for( int j=i+1; j<N-1; j++ ){
				for( int k=j+1; k<N; k++ ){
					if( bou[k]<bou[i]+bou[j] ){
						count++;
					}           
				}
			}
		}
		System.out.println(count);
	}
}

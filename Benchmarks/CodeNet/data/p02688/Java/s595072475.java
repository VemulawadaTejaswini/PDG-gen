
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] d = new int[k];
		int[] a = new int[n];
		for( int i=0 ; i < k ; i++ ) {
			d[i] = sc.nextInt();
			for( int j=0 ; j < d[i] ; j++ ) {
				int p = sc.nextInt(); 
				a[p-1]++;
			}
		}
		
		int c=0;
		for(int i=0; i<n ; i++ ) {
			if( a[i] == 0 )c++;
		}
		
		System.out.println(c);

	}

}


import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] D = new int[4];
		int[] point = new int[4];
		int ans = 0;
		for( int i=0; i<M; i++ ){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if( point[a]==0 ){
				D[a] = b;
				point[a] = 1;
			}else{
				if( D[a]!=b ){
					D[a] = -1;
					ans = 1;
				}
			}
		}
		if( point[1]==0 && N>1 ){
			D[1] = 1;          
        }          
		if( point[1]==1 && N>1 && D[1]==0 ){
			ans = 1;
		}
		if( ans==1 ){
			System.out.println(-1);
		}else{
			if( N==1 ){
				System.out.print(D[1]);
			}
			if( N==2 ){
				System.out.print(D[1]);
				System.out.print(D[2]);
			}
			if( N==3 ){
				System.out.print(D[1]);
				System.out.print(D[2]);
				System.out.print(D[3]);
			}
		}
	}
}

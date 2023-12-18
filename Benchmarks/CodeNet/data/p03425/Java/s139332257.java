import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char[] alp = new char[]{"M","A","R","C","H"};
		long[] count = new int[5];
		for( int i=1; i<=N; i++ ){
			String ss = sc.next();
			char cc = ss.charAt(0);
			for( int j=0; j<=4; j++ ){
				if( cc==alp[j] ){
					count[j]++;
					break;
				}
			}
		}
		long ans = 0;
		for( int i=0; i<=2; i++ ){
			for( int j=i+1; j<=3; j++ ){
				for( int k=j+1; k<=4; k++ ){
					ans += count[i]*count[j]*count[k];
				}
			}
		}
		System.out.println(ans);
	}
}

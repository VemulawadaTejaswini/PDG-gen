import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		long[] aa = new long[A];
		long[] bb = new long[B];
		long[] cc = new long[C];
		for( int i=0; i<A; i++ ){
			aa[i] = sc.nextLong();
		}
		for( int i=0; i<B; i++ ){
			bb[i] = sc.nextLong();
		}
		for( int i=0; i<C; i++ ){
			cc[i] = sc.nextLong();
		}
		Arrays.sort(aa);
		Arrays.sort(bb);
		Arrays.sort(cc);
		long ans = 0;
		long secA = 0,secB = 0,secC = 0;
		for( int i=A-X; i<A; i++ ){
			if( i==A-X ){
				secA = aa[i];
			}else{
				ans += aa[i];
			}
		}
		for( int i=B-Y; i<B; i++ ){
			if( i==B-Y ){
				secB = bb[i];
			}else{
				ans += bb[i];
			}
		}
		secC = cc[C-1];
		long D = Math.min( secA, Math.min(secB,secC) );
		System.out.println(ans+secA+secB+secC-D);
	}
}

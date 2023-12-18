import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long E = C*D;
		long F = Math.max(C,D);
		long G = Math.min(C,D);
		for( long i=1; i*i<=G; i++ ){
			if( G%i==0 ){
				if( F%(G/i)==0 ){
					E = (C*D)/(G/i);
					break;
				}
				if( F%i==0 ){
					E = (C*D)/i;
				}
			}
		}    
		System.out.println( (B-A+1) - (B/C+B/D-B/E) + ((A-1)/C+(A-1)/D-(A-1)/E) );     
	}
}

import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int[] five = new int[71];
		for( int i=1; i<=70; i++ ){
			five[i] = i*i*i*i*i;
		}
		loop:for( int i=0; i<=70; i++ ){
			for( int k=0; k<=70; k++ ){
				if( five[i]-five[k]==X ){
					System.out.println(i+" "+k);
					break loop;
				}
				if( five[i]+five[k]==X ){
					System.out.println(i+" "+(-k));
					break loop;
				}			
			}
		}
	}
}
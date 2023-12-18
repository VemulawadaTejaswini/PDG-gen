import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int aa = 0;
		int bb = 0;
		for( int i=13; i<=1250; i++ ){
			if( i*8/100==A ){
				aa = i;
				break;
			}
		}
		for( int i=10; i<=1000; i++ ){
			if( i/10==B ){
				bb = i;
				break;
			}
		}
		if( Math.max(aa,bb)-Math.min(aa,bb)<10 ){
			System.out.println(Math.max(aa,bb));
		}else{
			System.out.println(-1);
		}  
	}
}

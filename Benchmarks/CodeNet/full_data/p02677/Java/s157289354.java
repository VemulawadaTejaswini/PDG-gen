import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double H = sc.nextDouble();
		Double M = sc.nextDouble();      
		Double R = Math.abs( (H*30+M*0.5) - (M*6) );
		if( R>180 ){
			R = 360-R;          
        }          
		Double ans = A*A + B*B - 2*A*B * Math.cos(Math.toRadians(R));
		System.out.println(Math.sqrt(ans));    
	}
}
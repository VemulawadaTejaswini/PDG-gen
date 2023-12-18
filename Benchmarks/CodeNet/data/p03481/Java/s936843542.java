import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		long Y = sc.nextLong();
		int count = 1;
		int a = 0;
		while( a==0 ){
			X = X*2;
			if( X>Y ){
				a = 1;
				break;
			}else{
				count++;
			}
		}
		System.out.println(count);
	}
}

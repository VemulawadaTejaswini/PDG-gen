import java.util.*;

public class Main{
//public class abc167_b{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long k = scan.nextLong();
		
		long sum = 0;

		if(k >= a){
			sum += a;
			if( (k-a) >= b ){
				if( (k-a-b) > 0 )sum -= (k-a-b);
			}
		}else{
			sum += k;
		}

		System.out.println(sum);
	}

}
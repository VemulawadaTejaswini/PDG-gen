import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long k = scan.nextLong();

		boolean flag = true;

		while(flag){
			long min = Math.abs(n-k);
			if(n <= min){
				flag = false;
			}else{
				n =min;
			}
		}
		System.out.println(n);

	}
}
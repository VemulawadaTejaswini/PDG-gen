import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long x = sc.nextInt();

		long count = 0;
		count = b/x - a/x;

		if(b % x == 0 ){
			count = count + 1 ;
		}

		System.out.println(count);

	}
}
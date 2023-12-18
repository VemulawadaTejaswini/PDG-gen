import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long max = 0;
		long floor = 0;
		long count = 0;


		for (long i = n;i>1 ;i-- ) {
			floor = ((a*i)/b)-(a*(i/b));
			if (max<floor) {
				max = Math.max(max,floor);
			}else{
				count++;
			}
			if (count>10) {
				break;
			}

		}
		System.out.println(max);



	}
}

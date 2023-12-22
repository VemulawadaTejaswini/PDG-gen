import java.util.*;
public class Main{


	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		long s  =sc.nextLong();
		long w  =sc.nextLong();
		long c  =sc.nextLong();
		long d  =sc.nextLong();
		if(w+s>c+d && Math.max(s, w) >= Math.max(c, d)) {
				System.out.println(" Yes");
			}else {
				System.out.println("No");

			}
		
	}

}

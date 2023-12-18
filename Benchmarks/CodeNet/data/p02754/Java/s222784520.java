import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long N = scan.nextInt();
		long b = scan.nextInt();
		long r= scan.nextInt();

		long shou = N / (b+ r);
		long amari = N % (b+ r);

		if (b == 0) {
			System.out.println(0);
		}else{
			long ans = shou * b + amari;
			System.out.println(ans);
		}

	}
}
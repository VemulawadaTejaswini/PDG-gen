import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long W = scan.nextLong();
		long H = scan.nextLong();
		long x = scan.nextLong();
		long y = scan.nextLong();
		long ans = 0L;
		int count = 0;

		if(W*(H-y) > (W-x)*H) {
			ans = W*(H-y);
		}else if(W*(H-y) < (W-x)*H) {
			ans = (W-x)*H;
		}else if(W*(H-y) == (W-x)*H) {
			ans = W*(H-y);
			count = 1;
		}

		System.out.printf("%.20f",(double)ans);
		System.out.println(" "+count);
		scan.close();

	}

}

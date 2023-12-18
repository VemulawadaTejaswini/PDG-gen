import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Double A = scan.nextDouble();
		Double B = scan.nextDouble();
		Double as = 0.0;
		Double bs = 0.0;
		int hachi = 0;
		int ans = -1;
		boolean flag = false;

		while(as <= 1.0){
			hachi = (int) ((A + as) / 0.08);
			while(bs <= 1.0){
				if( (B + bs) == (hachi*0.1) ){
					ans = hachi;
					flag = true;
					break;
				}
				bs += 0.1;
			}
			as += 0.1;
			if (flag)break;
		}
		System.out.println(ans);
	}
}
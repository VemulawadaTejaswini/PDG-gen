import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long x = sc.nextLong();
		//double r = (x / (double)11) * 2;
		//System.out.println(r);
		//System.out.println(BigDecimal.valueOf(r).toPlainString());
		long r = (long)((x / (double)11) * 2), rt = x-r/2*11;
		if(0 < rt){
			if(rt <= 6){
				r++;
			}else{
				r+=2;
			}
		}
		System.out.println(r);
	}
}

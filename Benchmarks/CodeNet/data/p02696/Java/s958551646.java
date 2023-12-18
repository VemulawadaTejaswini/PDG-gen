//D
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = (double)(sc.nextInt());
		double b = (double)(sc.nextInt());
		double n = (double)(sc.nextInt());
		long tmp = (long)(a * n / b) - (long)(a * (long)(n / b));
		
		for (long i = 0; i < n; i++) {
			long tmp2 = 0;
			tmp2 = (long)(a * i / b) - (long)(a * (long)(i / b));
			if (tmp < tmp2) {
				tmp = tmp2;
			}
		}
		System.out.println(tmp);
	}
}
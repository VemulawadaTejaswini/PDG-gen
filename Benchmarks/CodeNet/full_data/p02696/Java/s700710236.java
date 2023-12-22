//D
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = (double)(sc.nextInt());
		double b = (double)(sc.nextInt());
		double n = (double)(sc.nextInt());
		int tmp = (int)(a * n / b) - (int)(a * (int)(n / b));
		
		for (int i = 0; i < n; i++) {
			int tmp2 = 0;
			tmp2 = (int)(a * i / b) - (int)(a * (int)(i / b));
			if (tmp < tmp2) {
				tmp = tmp2;
			}
		}
		System.out.println(tmp);
	}
}
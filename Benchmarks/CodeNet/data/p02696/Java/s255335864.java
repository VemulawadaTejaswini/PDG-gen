//D
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int tmp = (int)(a * n / b) - a * (int)(n / b);
		
		for (int i = 0; i < n; i++) {
			int tmp2 = 0;
			tmp2 = (int)(a * i / b) - a * (int)(i / b);
			if (tmp < tmp2) {
				tmp = tmp2;
			}
		}
		System.out.println(tmp);
	}
}
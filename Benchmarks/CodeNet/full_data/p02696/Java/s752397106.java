//D
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int tmp = (a * n / b) - a * (n / b);
		
		for (int i = 1; i < n; i++) {
			int tmp2 = (a * i / b) - a * (i / b);
			if (tmp < tmp2) {
				tmp = tmp2;
			}
		}
		System.out.println(tmp);
	}
}
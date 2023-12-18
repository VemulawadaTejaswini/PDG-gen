import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		if (k % 2 == 0) {
			int x = n / k;
			count += (x * x * x);
			int y = (n + k / 2) / k;
			count += (y * y * y);
		} else {
			int x = n / k;
			count += (x * x * x);
		}
		System.out.println(count);
	}
}
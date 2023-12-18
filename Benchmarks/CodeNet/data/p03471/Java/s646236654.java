import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		
		int n = sc.nextInt();
		int y = sc.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
		int sum = 0;
		for(int i=0; i<n + 1; i++) {
			if(sum + 10000 <= y) {
				sum += 10000;
				a++;
			} else if(sum + 5000 <= y) {
				sum += 5000;
				b++;
			} else if(sum + 1000 <= y) {
				sum += 1000;
				c++;
			}
			
			if(sum == y) {
				break;
			}
		}
		
		if(!( sum == y && a + b + c < n)) {
			a = -1;
			b = -1;
			c = -1;
		}
		
		
		System.out.println(String.format("%d %d %d", a, b, c));
	}
}

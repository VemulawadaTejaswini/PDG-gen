import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int money = 0;
		
		if(a <= b) {
			money += a;
		}else {
			money += b;
		}
		
		if(c <= d) {
			money += c;
		}else {
			money += d;
		}
		
		System.out.println(money);
	}
	
}
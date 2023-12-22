import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pay = sc.nextInt();
		
		int change = 1000 - pay;
		int cnt = 0;
		
		while(change > 0) {
			if(change >= 500) {
				change-=500;
				cnt++;
			} else if(change >= 100) {
				change-=100;
				cnt++;
			} else if(change >= 50) {
				change-=50;
				cnt++;
			} else if(change >= 10) {
				change-=10;
				cnt++;
			} else if(change >= 5) {
				change-=5;
				cnt++;
			} else if(change >= 1) {
				change-=1;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
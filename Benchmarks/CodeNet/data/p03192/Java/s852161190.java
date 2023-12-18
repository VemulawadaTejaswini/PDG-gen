import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt(){
		int n = sc.nextInt();
		int cnt = 0;
		while(n > 1) {
			if(n % 10 == 2) cnt++;
			n /= 10;
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}

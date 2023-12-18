
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long sum = 0;
		long ans = 0;
		for(int i=1; i<=x; i++) {
			sum += i;
			if(x<=sum) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}


}

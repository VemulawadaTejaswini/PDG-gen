
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int y=sc.nextInt();

		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(i+j>n)continue;
				int k=n-(i+j);
				if(10000*i + 5000*j + 1000*k == y) {
					System.out.println(i+" "+j+" "+k);
					sc.close();
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
		sc.close();
	}
}

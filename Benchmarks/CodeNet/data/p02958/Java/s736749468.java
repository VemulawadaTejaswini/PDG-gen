
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p[] =new int[n];

		int cnt=0;
		for(int i=0; i<n; i++) {
			p[i]=sc.nextInt();

		}
		for(int i=0; i<n; i++) {
			if(p[i] != i+1) cnt++;
		}

		if(cnt<=2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();
	}
}

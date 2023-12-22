import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	Scanner sc = new Scanner(System.in);

	int n, s;
	long ans;
	
	void run() {
		while (sc.hasNext()) {
			n = sc.nextInt();
			s = sc.nextInt();
			System.out.println(n+" "+s);
			if(n==0 && s==0) break;
			System.out.println("go");
			ans = 0;
			calc(0, n, 0);
			System.out.println(ans);
		}
	}
	
	void calc(int i, int nn, int sum){
		if(nn==0 && sum==s) {
			ans++;
			return;
		}
		if(sum>s || i>s || i>100 || nn==0) return;
		
		calc(i+1, nn-1, sum+i);
		calc(i+1, nn, sum);
	}
}
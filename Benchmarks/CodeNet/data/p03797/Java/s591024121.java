import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
	boolean used[];
	int n;
	int ans;
	public void run() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long ans = 0;
		long a = Math.min(n, m/2);
		ans += a;
		m -= 2*a;
		ans += m/4;
		System.out.println(ans);
		sc.close();
	}


}
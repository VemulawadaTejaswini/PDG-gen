import java.util.*;
import static java.lang.Math.*;
public class Main {
	static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		new Main().start();
	}
	private void start() {
		while(in.hasNext()) {
			System.out.println(solve(in.nextInt()));
		}
	}
	private long solve(int d) {
		long ans = 0L;
		for(int i = 0; i < 600/d; i++) ans+=(d*pow(d*i,2));
		return ans;
	}
}
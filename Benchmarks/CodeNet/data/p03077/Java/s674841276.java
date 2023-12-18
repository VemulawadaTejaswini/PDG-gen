import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long v[]=new long[5];
		long min = Long.MAX_VALUE;
		for(int i=0; i<5; i++) {
			v[i]=sc.nextLong();
			min=Math.min(min, v[i]);
		}
		long ans = 5;
		ans += n/min;
		System.out.println(ans);
		sc.close();
	}

}

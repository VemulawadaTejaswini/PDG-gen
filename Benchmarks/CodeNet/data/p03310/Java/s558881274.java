
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		long sum = 0;
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		long av = sum/4;
		ArrayList<Long> b = new ArrayList<Long>();

		sum = 0;
		int bc = 0;
		for(int i=0; i<n; i++) {
			if(bc<3) {
				if(sum + a[i] >= av && Math.abs(sum-av) <= Math.abs(sum+a[i]-av)) {
					b.add(sum);
					sum=0;
					bc++;
				}
			}
			sum += a[i];
		}
		b.add(sum);

		long min = 100100100100L;
		long max = -1;
		for(int i=0; i<b.size(); i++) {
			min = Math.min(min, b.get(i));
			max = Math.max(max, b.get(i));
		}
		System.out.println(Math.abs(max-min));
		sc.close();
	}


}

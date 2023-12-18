
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long sum = sc.nextLong();

		long cnt = 0;
		for(int i=1; i<n; i++) {
			long v= sc.nextLong();
			if(sum * v >= 0) {
				cnt += v + Math.abs(sum-v) + 1;
				if(sum<0) {
					v = 1;
				}else {
					v = -1;
				}
			}else {
				int s = 1;
				if(v<0) {
					s = -1;
				}
				if(Math.abs(sum)>=Math.abs(v)) {
					cnt+=Math.abs(sum)-Math.abs(v)+1;
					v += s*(Math.abs(sum)-Math.abs(v)+1);
				}
			}
			sum += v;
		}
		System.out.println(cnt);
		sc.close();
	}


}

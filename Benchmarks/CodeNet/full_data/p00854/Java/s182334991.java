import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	Scanner sc;

	void run() {
		for (;;) {
			int n = sc.nextInt();

			int k = sc.nextInt();
			int m = sc.nextInt();

			if ((n | k | m) == 0) {
				break;
			}

//			n--;
			boolean map[] = new boolean[n];

			int i = 0;
			int now = m-1;
			map[now] = true;
//			now = (now+1)%k;
			for (; i < n-1; i++) {
				int count = k-1;
				for (; count > 0;) {
//					System.out.println(map[now] + " " + now);
					if (!map[now])
						count--;
					now++;
					now = now%n;
				}
				for(;map[now];now = (now+1)%n);
//				System.out.println(now);
				map[now] = true;
			}
			
			System.out.println(now+1);
		}
	}

	Main() {
		sc = new Scanner(System.in);
		try {
			sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
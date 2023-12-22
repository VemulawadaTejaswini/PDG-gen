import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int[] tri = new int[3];
			for (int j = 0; j < 3; j++) {
				tri[j] = scan.nextInt();
				tri[j] *= tri[j];
			}
			Arrays.sort(tri);
			if (tri[0] + tri[1] == tri[2]) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int s = sc.nextInt();
		boolean b[] = new boolean[10000];
		Arrays.fill(b, false);
		b[s] = true;
		int i = 1;
		while(true) {
			i++;
			if(s % 2 == 0) s /= 2;
			else s = s * 3 + 1;
			if(b[s]) {
				System.out.println(i);
				return;
			}
			b[s] = true;
		}
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}

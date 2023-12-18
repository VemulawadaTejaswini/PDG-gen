import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int max = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int p = sc.nextInt();
			sum += p;
			if(max < p) max = p;
		}
		System.out.println(sum - max / 2);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}


import java.util.Scanner;
import java.util.Arrays;
public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int[] tmp = new int[3];
		tmp[0] = sc.nextInt();
		tmp[1] = sc.nextInt();
		tmp[2] = sc.nextInt();
		Arrays.sort(tmp);
		for(int a: tmp) {
			System.out.print(a);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}


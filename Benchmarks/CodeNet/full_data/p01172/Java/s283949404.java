import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	Scanner sc;

	void run() {
		for (;;) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ((a | b) == 0) {
				break;
			}

			int memo[] = new int[b];
			int first = a;
			int count = 0;
			int v1 = 0;
			int vv = 0;
			for (;;) {
				count++;
				if (memo[first] != 0) {
					v1 = memo[first] - 1;
					vv = count - memo[first];
					if(first ==0){
						vv = 0;
					}
					break;
				}
				memo[first] = count;
				first = first * 10;
				int v = first / b;
				int v2 = first % b;
				first = v2;

			}
			System.out.println(v1 + " " + vv);
		}
	}

	/**
	 * @param args
	 */

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
		// TODO Auto-generated method stub
		new Main().run();
	}

}
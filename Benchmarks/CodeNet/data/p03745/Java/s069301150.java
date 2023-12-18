import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int prevA = sc.nextInt();
		int state = 0; // prevAまで調べた結果、0 先頭、1単調非減少、2単調非増加

		int ans = 0; //分割回数

		for(int i=1;i<N;i++) {
			int a = sc.nextInt();
			switch(state) {
				case 0:
					if(prevA == a) {
						state = 0; //そのまま
					}else if(prevA < a) {
						state = 1;
					}else {
						state = 2;
					}
					break;
				case 1:
					if(prevA > a) {
						ans++;
						state = 0;
					}

					break;
				case 2:
					if(prevA < a) {
						ans++;
						state = 0;
					}
					break;
			}
			prevA = a;

		}

		out.println(ans+1);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

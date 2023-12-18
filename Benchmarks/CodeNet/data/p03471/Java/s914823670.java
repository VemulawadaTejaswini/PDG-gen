import java.util.*;

public class Main {

	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Y = scanner.nextInt();


		String a = "-1";
		String b = "-1";
		String c = "-1";


		for(int i = 0; i <= N; i++) {
			for(int j = 0; i + j <= N; j++) {
				int need_c = N - i - j;
				int temporary_result = 10000*i + 5000*j + 1000*need_c;
				if(temporary_result == Y) {
					a = String.valueOf(i);
					b = String.valueOf(j);
					c = String.valueOf(need_c);
					break;
				}
			}
		}

		System.out.println(a + " " + b + " " + c);
	}

}

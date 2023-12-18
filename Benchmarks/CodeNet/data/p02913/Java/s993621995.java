import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		String s = sc.next();

		sc.close();


		ArrayList<Integer>[] list = new ArrayList[26];
		for (int i = 0; i < 26; i++) {
			list[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < N; i++) {
			list[s.charAt(i) - 'a'].add(i);
		}

		int Max = 0;

		for (int i = 0; i < N - Max; i++) {
//			System.out.println("i:" + i + list[s.charAt(i) - 'a']);
			for (int begin : list[s.charAt(i) - 'a']) {
//				System.out.println("i:" + i + ", begin:" + begin);
				if (begin <= i + Max) continue;
				while (true) {
					if(begin + Max + 1 > N) break;
//					System.out.println(s.substring(i, i + Max + 1) + ", " + s.substring(begin, begin + Max + 1));
					if (s.substring(i, i + Max + 1).equals(s.substring(begin, begin + Max + 1))) {
						Max++;
						if(begin - i <= Max) break;
					} else {
						break;
					}
				}
			}
			list[s.charAt(i) - 'a'].remove(0);
		}

		System.out.println(Max);

	}
}

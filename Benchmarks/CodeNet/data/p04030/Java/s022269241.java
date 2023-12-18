import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		// A();
		B();

	}

	private static void B() throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();

		br.close();

		String[] AR = S.split("");
		String[] BR = new String[AR.length];

		for (int i = 0, j = 0; i < AR.length; i++) {
			if (!AR[i].equals("B")) {
				BR[j] = AR[i];
				j++;

			}else if(j != 0)
				j--;
		}

		for (int i = 0; i < BR.length; i++) {
			if (BR[i] == null)
				break;
			System.out.print(BR[i]);

		}
		System.out.println("");

	}

	private static void A() throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int kosuu = 0;
		br.close();

		for (int i = 0; i <= N; i++) {

			kosuu += i;

		}

		System.out.println(kosuu);
		;

	}

}

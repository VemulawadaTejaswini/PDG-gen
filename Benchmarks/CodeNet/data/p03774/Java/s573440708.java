import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		int[] n = new int[num.size()];
		for (int i = 0; i < num.size(); i++) {
			n[i] = num.get(i);
		}
		String[] p = new String[param.size()];
		for (int i = 0; i < param.size(); i++) {
			p[i] = param.get(i);
		}
		////////////////////////////////////////////////////////////////////
		int[] kekka = new int[num.size()];
		long min = 999999999999999999l;
		int ansewr = 0;

		for (int i = 0; i < n[0] * 2; i += 2) {
			for (int j = 0; j < n[1]; j++) {
				kekka[j] = Math.abs(n[i + 2] - n[j * 2 + 2 + n[0] * 2]) + Math.abs(n[i + 3] - n[j * 2 + 3 + n[0] * 2]);
				//System.out.println(min + " " + kekka[j]);
				//if(kekka[i] > 100000000) while(true);
				//System.out.println(kekka[j]);
				if (min > kekka[j]) {
					min = kekka[j];
					ansewr = j + 1;
				}
			}
			min = 999999999999999999l;
			System.out.println(ansewr);
		}

	}
}
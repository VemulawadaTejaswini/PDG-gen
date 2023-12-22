
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		wh: while (true) {
			n = Integer.parseInt(sc.nextLine());
			String[] clist = new String[n];
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {//すべての空港名をフルコード変換して配列に入れる。
				clist[i] = makeCode(sc.nextLine());
			} //end for i

			kfor: for (k = 1; k <= 51; k++) {
				ifor: for (int i = 0; i < n; i++) {
					jfor: for (int j = i + 1; j < n; j++) {
						if (clist[i].substring(0, Math.min(clist[i].length(), k))
								.equals(clist[j].substring(0, Math.min(clist[j].length(), k)))) {//部分が同じ場合
							continue kfor;
						}
					}
				}
				System.out.println(k);

				continue wh;
			}

			System.out.println("-1");

		}

		sc.close();
	}

	public static String makeCode(String name) {
		String code = "";
		code += name.charAt(0);
		for (int i = 0; i < name.length() - 1; i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'i' || name.charAt(i) == 'u' || name.charAt(i) == 'e'
					|| name.charAt(i) == 'o') {
				code += name.charAt(i + 1);
			}
		}
		return code;
	}

}


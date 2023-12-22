import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String[] lineString = sc.nextLine().split(" ");
		int n = (int) Math.pow(3, Integer.parseInt(lineString[0]));
		int[] position = new int[n];
		int[] salsa = new int[n];

		for (int i = 0; i < n; i++) {
			salsa[i] = salsa(i);
			position[i] = i;
		}

		String t = sc.nextLine();
		Pattern salsaReg = Pattern.compile("SS");
		Pattern rumbaReg = Pattern.compile("R{" + n + "," + n + "}");
		Matcher salsaMatch = salsaReg.matcher(t);
		Matcher rumbaMatch = rumbaReg.matcher(t);
		while (salsaMatch.find() || rumbaMatch.find()) {
			if (salsaMatch.find()) {
				t = salsaMatch.replaceAll("");
			}
			if (rumbaMatch.find()) {
				t = rumbaMatch.replaceAll("");
			}
			salsaMatch = salsaReg.matcher(t);
			rumbaMatch = rumbaReg.matcher(t);
		}
		for (int i = 0; i < t.length(); i++) {
			String ope = t.substring(i, i + 1);
			int count = 1;
			while (i + count < t.length() && t.substring(i + count, i + count + 1).equals(ope)) {
				count++;
			}
			i += count - 1;
			if (ope.equals("S")) {
				//Sの場合は奇数の時だけsalsa適用。
				if (count % 2 == 1) {
					for (int j = 0; j < n; j++) {
						position[j] = salsa[position[j]];
					}
				}
			} else {
				//Rの場合はcountだけずれる。
				count %= n;
				if (count > 0) {
					for (int j = 0; j < n; j++) {
						position[j] = (position[j] + count) % n;
					}
				}
			}
		}

		// 出力
		String result = "";
		for (int i = 0; i < position.length; i++) {
			if (!result.equals("")) {
				result += " ";
			}
			result += position[i];
		}
		System.out.println(result);
		sc.close();
	}

	static int salsa(int number) {
		String three = Integer.toString(number, 3);
		String threeReplace = three.replace("2", "3").replace("1", "2").replace("3", "1");
		return Integer.parseInt(threeReplace, 3);
	}
}

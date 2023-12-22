import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String alphabet[] = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int [] count = new int[26];
		Scanner sc = new Scanner(System.in);
		String inputValues = "";
		while (true) {
			String tmp = sc.nextLine();
			inputValues += tmp;
			if (!sc.hasNext()) {
				break;
			}
		}
		inputValues = inputValues.toLowerCase();
		String[] strAry = inputValues.split("");
		for (int i = 0; i < strAry.length; i++) {
			for (int j = 0; j < 26; j++) {
				if (strAry[i].equals(alphabet[j])) {
					count[j]++;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println(String.format("%s : %d", alphabet[i], count[i]));
		}
	}
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String W = sc.nextLine();
		W = W.toLowerCase();

		ArrayList<String> T = new ArrayList<String>();
		String kari = "";
		int ts = 0;

		while (true) {
			kari = sc.nextLine();
			if (kari.equals("END_OF_TEXT")) {
				break;
			}
			T.add(kari.toLowerCase());
			ts++;
		}

		int answer = 0;

		for (int i = 0; i < ts; i++) {
			
			String[] str = T.get(i).split(" ");
			for (int j = 0; j < str.length; j++) {
				if (str[j].equals(W)) {
					answer++;
				}
			}

		}
		
		System.out.println(answer);
	}

}
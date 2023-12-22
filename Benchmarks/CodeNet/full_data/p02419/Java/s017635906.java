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
			T.add(kari);
			ts++;
		}

		int answer = 0;
		String kariA = "";
		String kariB = "";

		for (int i = 0; i < ts; i++) {
			kariA = T.get(i).toLowerCase();
			kariB = kariA.replaceAll(W, "");
			answer += (kariA.length() - kariB.length()) / W.length();
		}
		
		System.out.println(answer);
	}

}
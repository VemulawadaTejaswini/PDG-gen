import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());

		ArrayList<String> dicA = new ArrayList<String>();
		ArrayList<String> dicC = new ArrayList<String>();
		ArrayList<String> dicG = new ArrayList<String>();
		ArrayList<String> dicT = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			String com = in.readLine();

			if (com.substring(0, 1).equals("i")) {
				if (com.substring(7, 8).equals("A")) {
					dicA.add(com.substring(7));
				} else if (com.substring(7, 8).equals("C")) {
					dicC.add(com.substring(7));
				} else if (com.substring(7, 8).equals("G")) {
					dicG.add(com.substring(7));
				} else if (com.substring(7, 8).equals("T")) {
					dicT.add(com.substring(7));
				}
			} else {
				if (com.substring(5, 6).equals("A")) {
					if (dicA.contains(com.substring(5))) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				} else if (com.substring(5, 6).equals("C")) {
					if (dicC.contains(com.substring(5))) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				} else if (com.substring(5, 6).equals("G")) {
					if (dicG.contains(com.substring(5))) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				} else if (com.substring(5, 6).equals("T")) {
					if (dicT.contains(com.substring(5))) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				}
			}

		}
	}
}
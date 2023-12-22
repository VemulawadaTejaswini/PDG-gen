import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(sc.next());
		}
		sc.close();

		int countAC = 0;
		int countWA = 0;
		int countTLE = 0;
		int countRE = 0;

		for(int i = 0; i < list.size(); i++) {
			String tmp = list.get(i);
			if(tmp.equals("AC")) {
				countAC++;
			}else if(tmp.equals("WA")) {
				countWA++;
			}else if(tmp.equals("TLE")) {
				countTLE++;
			}else if(tmp.equals("RE")) {
				countRE++;
			}
		}

		System.out.println("AC x " + countAC);
		System.out.println("WA x " + countWA);
		System.out.println("TLE x " + countTLE);
		System.out.println("RE x " + countRE);

	}

}
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String a = sc.nextLine().replace(" ", "");
			String b = sc.nextLine().replace(" ", "");
			int H = 0, B = 0;
			for (int i = 0 ; i < b.length() ; i++) {
				if (a.contains(""+b.charAt(i))) {
					if (a.indexOf(b.charAt(i)) == i) H++;
					else B++;
				}
			}
			System.out.println(H+" "+B);
		}


	}
}
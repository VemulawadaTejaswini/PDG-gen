import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);
		String[] cards = new String[n];
		for (int i = 0; i < n; i++) {
			cards[i] = sc.nextLine();
		}
		
		int Tpoint = 0;
		int Hpoint = 0;
		
		for (int i = 0; i < n; i++) {
			String[] kari = cards[i].split(" ");
			if (kari[0].compareTo(kari[1]) > 0) {
				Tpoint += 3;
			} else if (kari[0].compareTo(kari[1]) == 0) {
				Tpoint++;
				Hpoint++;
			} else if (kari[0].compareTo(kari[1]) < 0) {
				Hpoint += 3;
			}
		}
		
		System.out.print(Tpoint);
		System.out.print(" ");
		System.out.println(Hpoint);
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int chukan = sc.nextInt();
			int kimatsu = sc.nextInt();
			int saishi = sc.nextInt();

			if(chukan == -1 && kimatsu == -1 && saishi == -1) {
				break;
			}

			if (chukan == -1 || kimatsu == -1) {
				System.out.println("F");
			} else if(chukan + kimatsu >= 80) {
				System.out.println("A");
			} else if(chukan + kimatsu >= 65) {
				System.out.println("B");
			} else if(chukan + kimatsu >= 50) {
				System.out.println("C");
			} else if(chukan + kimatsu >= 30 && saishi >= 50) {
				System.out.println("C");
			} else if(chukan + kimatsu >= 30) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
}


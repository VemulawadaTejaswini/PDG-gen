import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String hitachi = "";
		boolean isHitachiString = false;
		for (int i = 0; i < 5; i++) {
			hitachi +="hi";
			if(s.equals(hitachi)) {
				isHitachiString = true;
				break;
			}
		}
		System.out.println(isHitachiString == true ? "Yes" : "No");
	}

}


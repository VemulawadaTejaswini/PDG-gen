import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kaibun = sc.next();
		int mojisuu = kaibun.length();

		if(kaibun.substring(0,(mojisuu-1)/2).equals(kaibun.substring((mojisuu+3)/2-1,mojisuu))) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}
}

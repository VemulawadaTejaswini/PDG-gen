import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int D = 25 - s.nextInt();
		String tmp = "Christmas";
		for(int i = 0;i < D;i++) {
			tmp += " Eve";
		}
		System.out.println(tmp);
	}

}
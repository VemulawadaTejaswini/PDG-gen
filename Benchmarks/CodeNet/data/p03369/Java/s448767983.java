import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String SArray[] = S.split("");
		int count = 0;

		for(int i = 0; i < S.length(); i++) {
			if (SArray[i].equals("o")){
					count++;
			}
		}

		System.out.println(700 + (100 * count));
	}

}
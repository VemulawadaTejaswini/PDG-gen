import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int min = Integer.MAX_VALUE;

		for(int i=0;i<=(S.length()-3);i++) {
			if(min > Math.abs(Integer.parseInt(S.substring(i, i+3))-753)) {
				min = Math.abs(Integer.parseInt(S.substring(i, i+3))-753);
			}
		}

		System.out.println(min);
	}
}

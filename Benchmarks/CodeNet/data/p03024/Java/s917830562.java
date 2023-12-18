import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int lo = 0;
		String s = scn.nextLine();
		for (int n = 0; n < s.length(); n++) {
			if (s.charAt(n) == 'x') lo++;
		}
		
		if (lo <= 7) System.out.println("YES");
		else System.out.println("NO");
	}

}

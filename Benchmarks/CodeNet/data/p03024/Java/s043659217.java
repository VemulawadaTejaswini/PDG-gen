import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			char[] s = sc.next().toCharArray();
			int countX = 0;
			for (int i = 0; i < s.length; i++) {
				if (s[i] == 'x') countX++; 
			}
			if (countX > 7) System.out.println("NO");
			else System.out.println("YES");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

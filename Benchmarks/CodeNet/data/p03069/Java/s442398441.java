import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int strLen = Integer.parseInt(sc.nextLine());
			String S = sc.next();
			
			S = S.replaceAll("#.", "T");
			int counter = 0;
			
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == 'T') {
					counter++;
				}
			}
			
			System.out.println(counter);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

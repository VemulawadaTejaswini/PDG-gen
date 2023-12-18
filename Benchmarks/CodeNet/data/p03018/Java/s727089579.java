import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			String initS = sc.next();
			String s = initS;
			int counter = 0;
			while (s.contains("ABC")) {
				s = s.replaceFirst("ABC", "BCA");
				counter++;
			}
			
			System.out.println(counter);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
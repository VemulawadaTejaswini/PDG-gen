
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int fieldSize = sc.nextInt(); // N
			int sNow = sc.nextInt() - 1; // A
			int hNow = sc.nextInt() - 1; // B 
			int sGoal = sc.nextInt() - 1; // C
			int hGoal = sc.nextInt() - 1; // D
			String s = sc.next();
			
			
			if (sGoal > hGoal) {
				s = s.replaceAll("#..#", "####");
			}
			for (int i = 0; i < fieldSize; i++) {
				if (s.charAt(i) == '#' && s.charAt(i+1) == '#' && (i < hGoal || i < sGoal)) {
					System.out.println("No");
					return;
				}
			}
				
			System.out.println("Yes");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int animals = scanner.nextInt();
			int legs = scanner.nextInt();
			int cranes = (legs - 2 * animals) / 2;
			int turtles = animals - cranes;
			boolean result = true;
			
			if(turtles * 2 + cranes * 4 != legs || turtles < 0 || cranes < 0) {
				result = false;
			}
			
			String decision = result? "Yes" : "No";
			System.out.print(decision);
		}
}

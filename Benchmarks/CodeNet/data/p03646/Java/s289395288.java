import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
 
		long nico = Long.parseLong(sc.nextLine());
		
		if (nico == 0) {
			System.out.println(2);
			System.out.println(1 + " " + 1);
		} else if (nico == 1) {
			System.out.println(2);
			System.out.println(0 + " " + 2);
		} else {
			System.out.println(nico);
			
			StringBuilder sb = new StringBuilder();
			sb.append(nico);
			for (int i = 1; i < nico; i++) {
				sb.append(" " + nico);

				if (nico % 1000000 == 0) {
					System.out.println(sb);
					sb.setLength(0);
				}
			}
			System.out.println(sb);
		}
	}
}
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(" ");
			
			double dxab = Double.parseDouble(nico[0]) - Double.parseDouble(nico[2]);
			double dyab = Double.parseDouble(nico[1]) - Double.parseDouble(nico[3]);
			double dxcd = Double.parseDouble(nico[4]) - Double.parseDouble(nico[6]);
			double dycd = Double.parseDouble(nico[5]) - Double.parseDouble(nico[7]);
			
			if ((dxab * dxcd + dyab * dycd) == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
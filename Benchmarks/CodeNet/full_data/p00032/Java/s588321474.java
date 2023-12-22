import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		ArrayList<String> sets = new ArrayList<String>();
		
		int r = 0;
		int l = 0;
		while (sc.hasNextLine() == true) {
			String[] params = sc.nextLine().split(",");
			
			int a = Integer.parseInt(params[0]);
			int b = Integer.parseInt(params[1]);
			int c = Integer.parseInt(params[2]);

			if (sets.contains(a + "," + b + "," + c) == false) {
				sets.add(a + "," + b + "," + c);
				sets.add(b + "," + c + "," + a);
				sets.add(c + "," + a + "," + b);
				sets.add(c + "," + b + "," + a);
				sets.add(b + "," + a + "," + c);
				sets.add(a + "," + c + "," + b);
			
				if ((a * a + b * b) == (c * c)) r++;
				else l++;
			}
		}

		System.out.println(r);
		System.out.println(l);
	}
}
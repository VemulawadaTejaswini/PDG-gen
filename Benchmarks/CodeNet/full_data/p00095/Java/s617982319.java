import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int max = 0;
		int num = 0;
		
		int nico = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < nico; i++) {
			String[] data = sc.nextLine().split(" ");
			
			int tmp = Integer.parseInt(data[1]);
			if (max < tmp) {
				max = tmp;
				num = Integer.parseInt(data[0]);
			}
		}
		System.out.println(num + " " + max);
	}
}
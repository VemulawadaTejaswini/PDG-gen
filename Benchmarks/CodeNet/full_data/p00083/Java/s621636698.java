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

			int ymd = Integer.parseInt(nico[0] + String.format("%2s", nico[1]) + String.format("%2s", nico[2]));
			int y = Integer.parseInt(nico[0]);
			
			String ans = " " + nico[1] + " " + nico[2];
			if (ymd < 18680908) {
				System.out.println("pre-meiji");
			} else if (ymd < 19120730) {
				ans = "meiji " + (y - 1867) + ans;
			} else if (ymd < 19261225) {
				ans = "taisho " + (y - 1911) + ans;
			} else if (ymd < 19890108) {
				ans = "showa " + (y - 1925) + ans;
			} else {
				ans = "heisei " + (y - 1988) + ans;				
			}
			
			System.out.println(ans);
		}
	}
}
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int num = 0;
		while (sc.hasNextLine() == true) {
			String line = sc.nextLine();

			int state = 0;
			int tmp = 0;
			for (int i = 0; i < line.length(); i++) {
				if (Character.isDigit(line.charAt(i)) == true) {
					tmp = tmp * 10 + line.charAt(i);
					state++;
				} else {
					if (state > 0) {
						num = num + tmp;

						state = 0;
						tmp = 0;
					}
				}
			}
		}
		
		System.out.println(num);
	}
}
import java.util.*;

public class Main{
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		Integer[] list = new Integer[3];
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		for (int i=0; i<6; i++) {
			int temp = scanner.nextInt();
			
			switch (temp) {
			
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			}
		}
		
		if (one>=3 || two>=3 || three>=3 || four>=3) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
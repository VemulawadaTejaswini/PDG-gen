import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		String input = sc.next();
		
		int tmp = 0;
		for(String i: arr) {
			if(input.equals(i)) {
				System.out.println(7-tmp);
				return;
			}
			
			tmp++;
		}
	}
}
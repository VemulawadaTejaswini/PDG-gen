import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] arr = S.split("");
		
		int count = 1;
		
		for(String s : arr) {
			if (count % 2 == 0) {
				if (s.equals("L") || s.equals("U") || s.equals("D")) {
					
				} else {
					System.out.println("No");
					break;
				}
			} else {
				if (s.equals("R") || s.equals("U") || s.equals("D")) {
					
				} else {
					System.out.println("No");
					break;
				}
			}
			
			if (count == arr.length) {
				System.out.println("Yes");
			}
			count++;
			
		}
		
	}

}

import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		String sc = in.nextLine();
		if (sc.length() < 4) {
			System.out.println("No");
		}else if (sc.charAt(0) == 'Y' && sc.charAt(1) == 'A' && sc.charAt(2) == 'K' && sc.charAt(3) == 'I') {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
  	}
}

import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if(s.charAt(1) == 'B'){
			System.out.println("ARC");
		}
		else{
			System.out.println("ABC");
		}
	}
}
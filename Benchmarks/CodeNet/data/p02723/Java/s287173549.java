import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
	
		if(text.charAt(2) == text.charAt(3) && text.charAt(4) == text.charAt(5)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
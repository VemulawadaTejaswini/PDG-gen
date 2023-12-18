
import static java.lang.System.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A(sc);
	}
	
	public static void A(Scanner sc) {
		int left =  0;
		int right = 0;
		for(int i=0;i<2;i++) {
			left += sc.nextInt();
		}
		for(int i=0;i<2;i++) {
			right += sc.nextInt();
		}
		if(left==right) out.println("Balanced");
		else if(left>right) out.println("Left");
		else out.println("Right");
	}
}

import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int A = 0;
		for (int i=0; i<4; i++) {
			A += sc.nextInt();
		}
		
		int B = 0;
		for (int i=0; i<4; i++) {
			B += sc.nextInt();
		}
		
		out.println(Math.max(A,B));
	}
}

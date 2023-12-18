package pro;
import java.util.*;

class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		
		if(A*B <= A-B) {
			if(A-B <= A+B) {
				System.out.println(A+B);
			}else {
				System.out.println(A-B);
			}
		}else if(A*B <= A+B) {
			System.out.println(A+B);
		}else {
			System.out.println(A*B);
		}
	}
}

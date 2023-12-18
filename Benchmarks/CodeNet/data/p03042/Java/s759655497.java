import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int a = Integer.parseInt(S.substring(0,2));
		int b = Integer.parseInt(S.substring(2,4));
		boolean A=false;
		boolean B=false;
		if (1<=a && a<=12) {
			A=true;
		}
		if (1<=b && b<=12) {
			B=true;
		}
		
		if (A && B) {
			System.out.println("AMBIGUOUS");
		} else if (A && !B) {
			System.out.println("MMYY");
		} else if (!A && B) {
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}

	}
}
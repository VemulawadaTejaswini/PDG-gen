import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int l = Integer.parseInt(s.substring(0,2));
		int r = Integer.parseInt(s.substring(2,4));
		
		if(0<l&&l<13&&0<r&&r<13) {
			System.out.println("AMBIGUOUS");
		}else if(0<l&&l<13) {
			System.out.println("MMYY");
		}else if(0<r&&r<13) {
			System.out.println("YYMM");
		}else {
			System.out.println("NA");
		}
	}
}


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int a = Integer.parseInt(s.substring(0, 3)), b = Integer.parseInt(s.substring(2));
		
		if(isMon(a)) {
			if(isMon(b))
				System.out.println("NA");
			else
				System.out.println("MMYY");
		} else {
			if(isMon(b))
				System.out.println("YYMM");
			else
				System.out.println("AMBIGUOUS");
		}
	}
	
	public static boolean isMon(int x) {
		return x >= 1 && x <= 12;
	}
}

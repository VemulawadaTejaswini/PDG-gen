import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
		String b = text.substring(0, 2);
		String a = text.substring(2,4);
		
		int before = Integer.parseInt(b);
		int after = Integer.parseInt(a);
		
		if(before > 0 && before <= 12) {
			
			if (after > 0 && after <= 12) {
				System.out.println("AMBIGUOUS");
			} else {
				System.out.println("MMYY");
			}
		}else {
			if (after > 0 && after <= 12) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
		}
		
		
//		long n= sc.nextLong();
	}
}
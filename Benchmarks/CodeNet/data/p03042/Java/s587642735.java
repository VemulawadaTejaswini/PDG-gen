import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int rigth = Integer.parseInt(S.substring(0,2));
		int left = Integer.parseInt(S.substring(2,4));
		
		if(rigth == 0) {
			if(left == 0) {
				System.out.println("NA");
			}else if (left <= 12) {
				System.out.println("YYMM");
			}else {
				System.out.println("NA");
			}
		}else if (rigth <= 12) {
			if(left == 0) {
				System.out.println("MMYY");
			}else if(left <= 12){
				System.out.println("AMBIGUOUS");
			}else {
				System.out.println("MMYY");
			}
		}else {
			if(left == 0) {
				System.out.println("NA");
			}else if(left <= 12){
				System.out.println("YYMM");
			}else {
				System.out.println("NA");
			}
		}
		
	}
}
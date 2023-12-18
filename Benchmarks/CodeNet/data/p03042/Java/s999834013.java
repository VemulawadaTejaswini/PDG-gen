
import java.util.Scanner;
 
class Main{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in) ;
		String s = scan.next();
		int a = Integer.parseInt(s.substring(0,2));
		int b = Integer.parseInt(s.substring(2,4));
		
		if((a>0 && b>0) &&(a<=12 || b<=12)) {
			
			if(a >12 && b<=12)
			{
				System.out.println("YYMM");
			}else if(b>12 && a<=12) {
				System.out.println("MMYY");
			}else {
				System.out.println("AMBIGUOUS");
			}
		}else {
			System.out.println("NA");
		}
		//(a<=0) || (b<=0) || (a > 12 && b >12 )
	}
}
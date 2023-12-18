import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		
		String initial = s.substring(0,2);
		
		int a = Integer.parseInt(initial); //前2文字を数字化
		
		String finish = s.substring(2,4);
		int b = Integer.parseInt(finish); //後ろ2文字を数字化
		
		
		if((1 <= a && a<= 12 && b > 0) && (1 <= b && b<= 12 && a > 0) ) {
			System.out.println("AMBIGUOUS");
		}else if((1 <= a && a<= 12) && b > 0) {
			System.out.println("MMYY");
		}else if((1 <= b && b<= 12) && a > 0){
			System.out.println("YYMM");
		}else {
			System.out.println("NA");
		}
			
			
			
		
		
		
		
	}

}

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S  = keyboard.next();
		 String[] T = S.split("");
		
		int a = Integer.parseInt(T[0]);
		int b = Integer.parseInt(T[1]);
		int c = Integer.parseInt(T[2]);
		int d = Integer.parseInt(T[3]);

		int AA = 10*a + b;
		int BB = 10*c + d;
				
		String ans = "";
		if(AA == 0) {
			ans = "NA" ;
		}else if(BB == 0) {
			ans = "NA" ;
		}else if(AA < 13 && BB > 13) {
			if(BB < 32 ) {
				ans = "MMYY" ;
			}else {
				ans = "NA" ;
			}
		}else if(AA > 13 && BB < 13) {
			if(AA < 32 ) {
				ans = "YYMM" ;
			}else {
				ans = "NA" ;
			}
		}else if(AA > 32  &&  BB > 32) {
			ans = "NA" ;
		}else if(AA < 13 && BB < 13) {
			ans = "AMBIGUOUS" ;
		}
		
		System.out.print(ans);
		keyboard.close();	
	}
}

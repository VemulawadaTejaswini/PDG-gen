import java.util.*;
import java.lang.*;
class at1_2016_0731_A_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		if (0 < a && a <= b){
		 	System.out.println("Positive");
		} else if (a <= b && b < 0){
			if((b - a + 1) % 2 == 1){
				System.out.println("Positive");
			} else {
			 	System.out.println("Negative");
			}
		} else if (a <= 0 && 0 <= b){
		 	System.out.println("Zero");
		}
	}
}

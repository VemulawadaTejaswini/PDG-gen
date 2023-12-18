import java.util.*;
import java.lang.*;
class at1_2016_0731_A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long head = sc.nextInt();
		long tail = sc.nextInt();
		long num = head; 
		
		for (long i = head + 1L ; i <= tail; i++){
			num *= i;
		} 
		int num2 = Long.signum(num);
			
		if(num2 == -1){
		 	System.out.println("Negative");
		 } else if(num2 == 1){
		 	System.out.println("Positive");
		 } else if(num2 == 0) {
		 	System.out.println("Zero");
		 }

	}
}

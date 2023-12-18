import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long A = keyboard.nextLong();
		long B = keyboard.nextLong();
		long C = keyboard.nextLong();
		long X = keyboard.nextLong();
		long Y = keyboard.nextLong();
		
		long Large = X >= Y ? X : Y;
		long small = X <= Y ? X : Y; 
		
		long sum = 0;
		long nokori = Large - small;
		
		if(A+B > 2*C) {
			sum = small*(2*C);
			
			if(Large == X) {
				if(A < 2*C) {
					sum += nokori*A;
				}else {
					sum += nokori*2*C;
				}
			}else{
				if(B < 2*C) {
					sum += nokori*B;
				}else {
					sum += nokori*2*C;
				}
			}
			
		}else {
			sum = A*X + B*Y;
		}
		
		System.out.print(sum);
		keyboard.close();
	}
}
//???????????°?????????
package ITP1;
import java.util.*;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a = 1;
		int b = 1;
		int max = 0;
		while(a != 0 && b != 0){
			a = scanner.nextInt();
			b = scanner.nextInt();
			if(a == 0 && b == 0){break;}
			if(a > max){		
				max = a;
			}
			if(b > max){
				max = b;
				System.out.println(b + " " + a);
			}
			else{
				System.out.println(a + " " + b);
			}
		}
		
		
		
	}

}
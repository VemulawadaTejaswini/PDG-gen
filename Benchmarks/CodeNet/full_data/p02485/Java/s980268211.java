import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		for(;;){
			int x = sc.nextInt();
			int a = x;
			int b = x;
			int counter = 0;
			if(x == 0){
				break;
			}
			do{
				a = b % 10;
				b /= 10;
				counter += a;
			}
			
			while(b != 0);
			System.out.println(counter);
		}
			
	}
}
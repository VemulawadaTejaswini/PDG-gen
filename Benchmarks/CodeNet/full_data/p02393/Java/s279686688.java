import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int temp;
		
		if (a > b){
			temp = b;
			b = a;
			a = temp;
		}
		
		if (b > c){
			temp = c;
			c = b;
			b = temp;
		}
		
		if (a > b){
			temp = b;
			b = a;
			a = temp;
		}
		
		
		System.out.println(a + " " + b + " "  + c);

	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		int a = input.nextInt();
		int b = input.nextInt();
		while(true){
			if(a == 0 && b == 0) break;
			
			if(a < b) System.out.println(a + " " + b);
			else System.out.println(b+ " " + a);
			
			a = input.nextInt();
			b = input.nextInt();
		}
	}
	
}
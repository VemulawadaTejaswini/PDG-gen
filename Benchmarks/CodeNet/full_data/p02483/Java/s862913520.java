import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a <= b && a <= c){
			if(b > c){
				System.out.print(a + " " + c + " " + b);
			}
			else{
				System.out.print(a + " " + b + " " + c);
			}
		}
		else if(b <= a&& b <= c){
			if(a > c){
				System.out.print(b + " " + c + " " + a);
			}
			else{
				System.out.print(b + " " + a + " " + c);
			}
		}
		else{
			if(a > b){
				System.out.print(c + " " + b + " " + a);
			}
			else{
				System.out.print(c + " " + a + " " + c);
			}
		}
		
	}
}
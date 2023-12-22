import java.util.Scanner;

public class p5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a <= b && a <= c){
			if(b > c){
				System.out.println(a + " " + c + " " + b);
			}
			else{
				System.out.println(a + " " + b + " " + c);
			}
		}
		else if(b <= a&& b <= c){
			if(a > c){
				System.out.println(b + " " + c + " " + a);
			}
			else{
				System.out.println(b + " " + a + " " + c);
			}
		}
		else{
			if(a > b){
				System.out.println(c + " " + b + " " + a);
			}
			else{
				System.out.println(c + " " + a + " " + c);
			}
		}
		
	}
}
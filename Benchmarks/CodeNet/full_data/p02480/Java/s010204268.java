import java.util.Scanner;

class Hello{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		System.out.println(x * x * x);
	}
}
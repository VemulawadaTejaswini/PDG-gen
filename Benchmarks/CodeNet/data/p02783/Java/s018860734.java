import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println((a - 1)/b + 1);
	}
}
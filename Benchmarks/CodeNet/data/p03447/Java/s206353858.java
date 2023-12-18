import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = x-a;
		int d = c/b*b;
		int remaining = c-d;
		System.out.println(remaining);
	}
}
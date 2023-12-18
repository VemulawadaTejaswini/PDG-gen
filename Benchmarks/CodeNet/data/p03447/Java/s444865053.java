import java.util.Scanner;
class Sweets{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = x-a;
		int l = c/b;
		int m = l*b;
		int change = c-m;
		System.out.println(change);
	}
}
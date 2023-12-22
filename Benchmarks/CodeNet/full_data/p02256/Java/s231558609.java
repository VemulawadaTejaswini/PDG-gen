import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(euclid(Math.max(a, b), Math.min(a, b)));
	}
	public static int euclid(int a, int b){
		int c;
		while((c = a % b) != 0){
			a = b;
			b = c;
		}
		return b;
	}
}
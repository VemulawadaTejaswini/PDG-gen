import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), def = b - a, sum = 0;

		for(int i=1; i<=def; i++){
			sum += i;
		}
		System.out.println(sum-b);
	}
}
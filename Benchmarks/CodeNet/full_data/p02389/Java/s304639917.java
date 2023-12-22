public class Main{
	public static void main(String[] args){
		int a, b;
		int a = new java.util.Scanner(System.in).nextInt();
		int b = new java.util.Scanner(System.in).nextInt();
		int ans_area = a * b;
		int ans_long = 2 * ( a + b );
		System.out.println( ans_area + " " + ans_long );
	}
}
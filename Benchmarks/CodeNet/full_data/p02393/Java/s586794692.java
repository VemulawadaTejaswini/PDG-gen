import java.util.Scanner;

puublic class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int temp;
		
		if (a > b){
			temp = b;
			b = a;
			a = temp;
		}
		
		if (b > c){
			temp = c;
			c = b;
			b = temp;
		}
		
		System.out.println(a + " " + b + " " + c);
	}
}
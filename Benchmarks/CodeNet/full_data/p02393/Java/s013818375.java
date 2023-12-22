import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int kari;
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a > b){
			kari = a;
			a = b;
			b = kari;}
		
		if (b > c){
			kari = b;
			b = c;
			c = kari;}
		
		if (a > b){
			kari = a;
			a = b;
			b = kari;}
		
		System.out.println(a+" "+b+" "+c);
	}
}

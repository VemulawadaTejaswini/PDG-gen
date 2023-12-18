import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt();
		System.out.print(a%3==0||b%3==0||(a+b)%3==0?"Possible":"Impossible");
	}
}
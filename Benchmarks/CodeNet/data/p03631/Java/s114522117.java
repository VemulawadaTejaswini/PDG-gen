import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
		System.out.print(n/100%10==n%10?"Yes":"No");
	}
}
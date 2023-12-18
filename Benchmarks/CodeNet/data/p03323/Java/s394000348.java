import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt();
		System.out.print(a-b==-1||a-b==0||a-b==1?"Yay!":":(");
	}
}
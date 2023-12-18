import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt(),m=-1000;
		if(a+b>m) m=a+b;
		if(a-b>m) m=a-b;
		if(a*b>m) m=a*b;
		System.out.print(m);
	}
}
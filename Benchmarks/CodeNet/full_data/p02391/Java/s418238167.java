import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		if(a>c){
			System.out.println(a+">"+c);
			}
		else if(a<c){
			System.out.println(a+">"+c);
			}
		else{
			System.out.println(a+"=="+c);
			}
	}
}
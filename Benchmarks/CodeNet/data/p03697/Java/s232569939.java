import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		if(A+B>=10)
			System.out.println("error");
		else
			System.out.println(A+B);
	}
}

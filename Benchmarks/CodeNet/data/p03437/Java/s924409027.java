import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int X=stdIn.nextInt();
		int Y=stdIn.nextInt();
		if(X%Y==0)
			System.out.println(-1);
		else
			System.out.println(X);
	}
}
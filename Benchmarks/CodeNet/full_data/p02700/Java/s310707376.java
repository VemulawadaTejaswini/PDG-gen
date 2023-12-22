import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int D=stdIn.nextInt();
		while(true){
			C-=B;
			if(C<=0){
				System.out.println("Yes");
				System.exit(0);
			}
			A-=D;
			if(A<=0){
				System.out.println("No");
				System.exit(0);
			}
		}
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int K=stdIn.nextInt();
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int key=K;
		while(true){
			if(A<=key&&key<=B){
				System.out.println("OK");
				System.exit(0);
			}
			if(key>B){
				System.out.println("NG");
				System.exit(0);
			}
			key*=K;
		}
	}
}

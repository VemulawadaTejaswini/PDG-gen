import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c)){
			if(Math.sqrt(a)==Math.sqrt(b)&&a!=b){
				System.out.println("No");
				System.exit(0);
			}
			System.out.println("Yes");
		}
		else{
			if(Math.sqrt(a)==Math.sqrt(b)&&a!=b){
				System.out.println("Yes");
				System.exit(0);
			}
			System.out.println("No");
		}
	}
}

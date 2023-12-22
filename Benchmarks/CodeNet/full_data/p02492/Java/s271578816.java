import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x=0;
		int a = scan.nextInt();
		String str = scan.next();
		int b = scan.nextInt();
		if(str.equals("?")){
		
		}else{
			
		if (str.equals("+")){
			x = a+b;
		}
		else if(str.equals("-")){
			x = a-b;
		}
		else if(str.equals("*")){
			x = a*b;
		}
		else if(str.equals("/")){
			x = a/b;
		}
		System.out.println(x);
		}
	}
}
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		String op=sc.next();
		int b=sc.nextInt();
		
		while(!op.equals("?")){
		int ans=0;
		switch (op){
			case "+":
				ans=a+b;
				break;
			case "-":
				ans=a-b;
				break;
			case "*":
				ans=a*b;
				break;
			case "/":
				ans=a/b;
				break;
			case "?":
				break;
		}
				System.out.println(ans);
				
				a =sc.nextInt();
				op=sc.next();
				b=sc.nextInt();
		}
	}

}
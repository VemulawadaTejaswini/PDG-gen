import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);


		while(true){
		int a =  sc.nextInt();
		int b = sc.nextInt();
		String op = sc.nextLine();


			if(op.equals("+")){
				System.out.println(a+b);
			}else if(op.equals("-")){
				System.out.println(a-b);
			}else if(op.equals("*")){
				System.out.println(a*b);
			}else if(op.equals("/")){
				System.out.println(a/b);
			}else if(op.equals("?")){
				break;
			}
		}

	}
}

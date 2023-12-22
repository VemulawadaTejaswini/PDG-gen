import java.util.Scanner;


class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(i==0){
			int a = scan.nextInt();
			String or = scan.next();
			int b = scan.nextInt();
			if(or.equals("?")){
				 i=1;
				 break;
			     }else if(or.equals("+")){
					System.out.println(a + b);
				 }else if(or.equals("-")){
				 	System.out.println(a - b);
				 }else if(or.equals("*")){
				 	System.out.println(a * b);
				 }else if(or.equals("/")){
				 	System.out.println(a / b);
			}
		}
	}
}

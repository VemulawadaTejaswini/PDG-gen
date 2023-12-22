import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){

			String[] exp = sc.nextLine().split(" ");
			int a = Integer.parseInt(exp[0]);
			int b = Integer.parseInt(exp[2]);

			if("+".equals(exp[1])){
				System.out.println(a + b);
			}else if("-".equals(exp[1])){
				System.out.println(a - b);
			}else if("*".equals(exp[1])){
				System.out.println(a * b);
			}else if("/".equals(exp[1])){
				System.out.println(a / b);
			}else if("?".equals(exp[1])){
				break;
			}
		}
	}
}
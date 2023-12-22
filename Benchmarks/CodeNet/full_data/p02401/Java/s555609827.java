import java.util.Scanner;

class Main{
	public static void main(String[] args){
		int a;
		String op;
		int b;
		int result = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			a = sc.nextInt(); 
			op = sc.next();
			b = sc.nextInt();
			if(op.equals("?")){
				//flag = false;
				break;
			}
			switch(op){
				case "+":
					System.out.println(a + b);
					break;
				case "-":
					System.out.println(a - b);
					break;
				case "*":
					System.out.println(a * b);
					break;
				case "/":
					System.out.println(a / b);
					break;
				case "?":
					flag = false;
					break;
			}
			
		}
	}
}
			

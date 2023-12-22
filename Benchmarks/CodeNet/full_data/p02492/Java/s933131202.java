import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Calculator calc = new Calculator();
		String[] s;
		while(true){
			s = calc.input();
			if(calc.calculate(s)){
				break;
			}
		}
	}
}

class Calculator{
	public String[] input(){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] s = str.split(" ");
		return s;
	}
	
	public boolean calculate(String s[]){
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[2]);
		switch(s[1]){
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		case "?":
			return true;
		}
		
		return false;
	}
}
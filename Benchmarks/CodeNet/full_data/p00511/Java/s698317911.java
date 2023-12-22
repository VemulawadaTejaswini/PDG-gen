import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int s = stdIn.nextInt();
		while(true){
			String input1 = stdIn.next();
			if(input1.equals("=")){
				break;
			}
			int input2 = stdIn.nextInt();
			if(input1.equals("+")){
				s += input2;
			}
			else if(input1.equals("-")){
				s -= input2;
			}
			else if(input1.equals("*")){
				s *= input2;
			}
			else if(input1.equals("/")){
				s /= input2;
			}
		}
		System.out.println(s);
	}
}
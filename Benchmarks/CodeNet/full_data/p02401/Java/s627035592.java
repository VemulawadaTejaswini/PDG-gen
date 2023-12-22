import java.util.Scanner;

public class Main{

public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	while(true){

		int a = sc.nextInt();
		String op = sc.next();
		int c = sc.nextInt();

		if (op.equals("?"))break;

		int ans = 0;

		switch(op){
		case "+":
			ans = a + c;
			break;
		case "-":
			ans = a - c;
			break;
		case "*":
			ans = a * c;
			break;
		case "/":
			ans = a / c;
			break;
		}

	System.out.println(ans);

	}
    }
}

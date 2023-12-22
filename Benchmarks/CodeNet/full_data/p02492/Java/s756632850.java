import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = 0;
	
	while (scan.hasNext()) {
	    int n1 = scan.nextInt();
	    String op = scan.next();
	    int n2 = scan.nextInt();
	    
	    int answer = 0;	    
	    switch (op) {
	    case "+":
		answer = n1 + n2;
		break;
	    case "-":
		answer = n1 - n2;
		break;
	    case "*":
		answer = n1 * n2;
		break;
	    case "/":
		answer = n1 / n2;
		break;
	    case "?":
		System.exit(0);
		break; // 一応
	    default:
		// 本来ならエラー処理
		System.out.println("演算子エラー");
		break;
	    }

	    System.out.println(answer);
	}
    }
}
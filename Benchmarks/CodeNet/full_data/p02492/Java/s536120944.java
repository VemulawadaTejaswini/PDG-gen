import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ÈPÌ½ßAüÍÌ`FbNÍµÈ¢
		//ÅÌ®ðÇÝæé
		int a = sc.nextInt();
		
		//IyhðÇÝæé
		String operand = sc.next();

		//ÅãÌ®ðÇÝæé
		int b = sc.nextInt();
		//[ZÆÈéêxµÄvOðI¹·é
		if((operand.charAt(0) == '/') && (b == 0)){
			System.out.println("[Z");
			System.exit(0);
		}
		
		//IyhÉ¶ÄÊðoÍ·é
		switch(operand.charAt(0)){
		case '+' :
			System.out.println(a + b);
			break;
		case '-' :
			System.out.println(a - b);
			break;
		case '*' :
			System.out.println(a * b);
			break;
		case '/' :
			System.out.println(a / b);
			break;
		case '?' :
			break;
		default:
			System.out.println("s³ÈIyh");
		}
	}
}
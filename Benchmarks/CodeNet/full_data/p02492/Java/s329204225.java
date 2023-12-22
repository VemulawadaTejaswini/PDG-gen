import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> result = new ArrayList<Integer>();
		String operand;
		int a, b;
		
		label:
		//ÈPÌ½ßüÍtH[}bgÌ`FbNÍsíÈ¢
		while(sc.hasNextLine()){
			//ÅÌ®ðÇÝæé
			a = sc.nextInt();
			
			//IyhðÇÝæé
			operand = sc.next();
			
			//ÅãÌ®ðÇÝæé
			b = sc.nextInt();
			//[ZÆÈéêxµÄvOðI¹·é
			if((operand.charAt(0) == '/') && (b == 0)){
				System.out.println("[Z");
				System.exit(0);
			}
			//IyhÉ¶ÄÊðÊXgÉÇÁ·é
			switch(operand.charAt(0)){
			case '+' :
				result.add(a + b);
				break;
			case '-' :
				result.add(a - b);
				break;
			case '*' :
				result.add(a * b);
				break;
			case '/' :
				result.add(a / b);
				break;
			case '?' :
				break label;
			default:
				System.out.println("s³ÈIyh");
			}
		}
	
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}
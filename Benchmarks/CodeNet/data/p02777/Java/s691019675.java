import java.util.Scanner;

public class Main {


		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			Scanner scanner = new Scanner(System.in);
		    String S = scanner.next();
		    String T = scanner.next();
		    int A = scanner.nextInt();
		    int B = scanner.nextInt();
		    String U = scanner.next();
		    int a= A;
		    int b= B;

		    if(S.equals(U)) {
		    	a = --a;
		    }else{
		    	b = --b;
		    }
		    System.out.println(a+" "+b);
		}

	}
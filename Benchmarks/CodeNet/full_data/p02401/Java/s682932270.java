import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		int op = scan.nextInt();
		int b = scan.nextInt();
		//int op = scan.nextInt();

		int [] line;
		line = new int[2];
		line[0] = a;
		line[1] = op;
		line[2] = b;


		if("+".equals(op)){
			System.out.println(a+b);
		}else if("-".equals(op)){
			System.out.println(a-b);
		}else if("*".equals(op)){
			System.out.println(a*b);
		}else if("/".equals(op)){
			System.out.println(a/b);
		}else if("?".equals(op)){
		}

	}

}
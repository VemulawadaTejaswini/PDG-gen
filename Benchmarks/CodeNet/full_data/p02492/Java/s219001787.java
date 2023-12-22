import java.util.Scanner;
import java.io.*;

public class main10010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			String A=scan.next();
			String op=scan.next();
			String B=scan.next();
			if(op.equals("?")){
				break;
			}
			
			int a=Integer.parseInt(A);
			int b=Integer.parseInt(B);
			switch(op){
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
			}
		}
    }
}
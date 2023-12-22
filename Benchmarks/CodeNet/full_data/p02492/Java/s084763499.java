
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true){
			int a = scan.nextInt();
			String mark = scan.next();
			int b = scan.nextInt();

			if(mark.equals("?") == true){
				break;
			}

			if(mark.equals("+")){
				System.out.println(a+b);
			}else if(mark.equals("-")){
				System.out.println(a-b);
			}else if(mark.equals(a*b)){
				System.out.println(a*b);
			}else if(mark.equals("/")){
				System.out.println(a/b);
			}
		}
	}
}
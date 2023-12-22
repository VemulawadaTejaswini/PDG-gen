import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan= null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			while(scan.hasNext()){
				int a = scan.nextInt();
				String op = scan.next();
				int b = scan.nextInt();
				System.out.println(op);
				if(op =="+"){
					System.out.println(a + b);
				}else if(op == "-"){
					System.out.println(a - b);
				}else if(op == "*"){
					System.out.println(a * b);
				}else if(op == "/"){
					System.out.println(a / b);
				}else if(op == "?"){
					break;
				}
			}
		}finally{
			scan.close();
		}
	}
}
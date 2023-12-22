import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
		 int a = scan.nextInt();
		 int b = scan.nextInt();
		 int c = scan.nextInt();
		 int tmp,i;
			for (i = 0; i <= 2; ++i){
		     if(a > b){
				 tmp = a;
				 a = b;
				 b = tmp;
			 }
			 else if(b > c){
				 tmp = b;
				 b = c;
				 c = tmp;
			 }
		}
		 System.out.println(""+a+" "+b+" "+c);
	}
}
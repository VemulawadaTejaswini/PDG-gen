import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
		 int a = scan.nextInt();
		 int b = scan.nextInt();
		 int c = scan.nextInt();
		 int tmp,i;
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
		 else if(a > c){
			 tmp = a;
			 a = c;
			 c = tmp;
		 }
		 
		 	}
}
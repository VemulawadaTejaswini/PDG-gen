import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int a = std.nextInt();
		 int b = std.nextInt();
		 if(a>=13) {
			 System.out.println(b);
		 }
		 else if(a<=5) {
			 System.out.println("0");
		 }
		 else {
			 System.out.println(b/2);
		 }
	 }
}

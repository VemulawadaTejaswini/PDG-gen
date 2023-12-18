import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int p = std.nextInt();
		 int q = std.nextInt();
		 int r = std.nextInt();
		 if(p<=q&&r<=q) {
			 System.out.println(p+r);
		 }
		 else if(q<=p&&r<=p) {
			 System.out.println(q+r);
		 }
		 else if(q<=r&&p<=r) {
			 System.out.println(q+p);
		 }
	 }
}

import java.util.Scanner;

public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 long w = std.nextLong();
		 long h = std.nextLong();
		 long x = std.nextLong();
		 long y = std.nextLong();
		 double value =(double)((double) w*h/(double)2.0);
		 System.out.print(value);
		 if(w/2 == x&&h/2==y) {
			 System.out.print(" "+ 1);
		 }
		 else
			 System.out.print(" "+ 0);
	 }
}

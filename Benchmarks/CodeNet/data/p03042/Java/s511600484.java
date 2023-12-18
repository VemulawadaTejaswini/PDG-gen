import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int i = std.nextInt();
		 int ato = i%100;
		 int mae = (i-ato)/100;
		 if(isM(mae) && isM(ato)) {
			 System.out.println("AMBIGUOUS");
		 }
		 else if(isM(mae)) {
			 System.out.println("MMYY");
		 }
		 else if(isM(ato)) {
			 System.out.println("YYMM");
		 }
		 else {
			 System.out.println("NA");
		 }
	 }

	 static boolean isM(int a) {
		if(0<a&&a<=12) {
			return true;
		}
		else {
			return false;
		}
	 }
}


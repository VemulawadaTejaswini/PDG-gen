import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String N = sc.next();
		 String S = sc.next();
		 int count =0;
		 for (int i = 0; i < N.length(); i++) {
			 if (N.charAt(i) == S.charAt(i)) { 
			 } else {
				 count++;
			 }
		 }
		 System.out.print(count);
	}
}


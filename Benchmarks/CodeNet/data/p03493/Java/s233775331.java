import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String a = sc.next();
		 int count = 0;
		 for (int i= 0; i < 3; i++) {
			 if(a.charAt(i) == 0) {
				 count++;
			 }
		 }
		 System.out.print(count);
	}

}

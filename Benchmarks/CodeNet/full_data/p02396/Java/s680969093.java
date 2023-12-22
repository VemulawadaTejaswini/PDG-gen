import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
	  int iter = 0;
	  
	  while(scan.hasNextLine()) {
	     int i = Integer.parseInt(scan.nextLine());
		 if(i == 0) break;
		 System.out.println("Case " + ++iter + ": " + i);
	  }
   }
}



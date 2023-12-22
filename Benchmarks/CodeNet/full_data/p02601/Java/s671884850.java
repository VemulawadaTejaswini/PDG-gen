import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      int A = sc.nextInt(); //red
	      int B = sc.nextInt(); //green
	      int C = sc.nextInt(); //blue
	      String isClear = "No";
	      
	      int count = sc.nextInt();
	      Random random = new Random();
	      
	      
	      for(int i = 0; i < count; i++) {
	    	  int randomValue = random.nextInt(3);
		      switch (randomValue) {
				case 0:
					A *= 2;
					break;
				case 1:
					B *= 2;
					break;
				case 2:
					C *= 2;
					break;

				default:
					break;
				}
	      }
	      
	      if((B > A) && (C > B)) {
	    	  isClear = "Yes";
	      }
	      
	      System.out.println(isClear);


	}
}

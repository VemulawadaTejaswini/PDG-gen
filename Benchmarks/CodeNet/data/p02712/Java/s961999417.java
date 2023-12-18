import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int sum = 0;
      int num = Integer.parseInt(input.nextLine());    	

      for (int i = 1; i <= num; i++) {
          if (i % 3 == 0 && i % 5 == 0) {
            continue;
          }
          else if (i % 3 == 0) {
          	continue;
          }
          else if (i % 5 == 0) {
          	continue;
          }
          sum += i;
      }
      
      System.out.println(sum);
    }
}
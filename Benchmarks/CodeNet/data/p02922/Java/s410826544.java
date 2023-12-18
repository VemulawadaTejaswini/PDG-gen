import java.util.Scanner

public class Main {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int useTap = sc.nextInt();
      int nonTap = sc.nextInt();
      
      double d1 = (nonTap - 1) / (useTap - 1)
      int number = Math.ceil(d1);
      
      System.out.println(number);
      
      sc.close();
	}

}

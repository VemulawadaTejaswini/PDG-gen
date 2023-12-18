import java.util.Scanner;
public class Main{
  	public static void main (String [] args){
      	Scanner scanner = new Scanner (System.in);
      	int a = scanner.nextInt();
      	int b = scanner.nextInt();
      	int difference = a-b;
      	if (difference >= 0)
          	System.out.println(difference)
        else
          	System.out.println("0");
    }
}
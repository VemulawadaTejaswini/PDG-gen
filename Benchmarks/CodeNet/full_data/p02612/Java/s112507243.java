import java.util.Scanner;
public class Main{
public static void main(String [] args)
{
 
    Scanner sc = new Scanner(System.in);
  	System.out.println("Enter the the value for n");
    int userInput = sc.nextInt();
  
    double change = (double)(userInput % 1000);
  	System.out.println(change);
}
}

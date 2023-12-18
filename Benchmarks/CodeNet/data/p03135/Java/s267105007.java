import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      if(1 > a || a > 100){
        break;
      }
      int b = scan.nextInt();
      if(1 > b || b > 100){
        break;
      }
      System.out.print((double)(a / b));
    }
}
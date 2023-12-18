import java.util.Scanner;

public class Sample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	int a = scanner.nextLine();
    int b = scanner.nextLine();
    scanner.close();
    
    if(a % 2 == 0){
      System.out.print("Even");
        return;
    }
 
    if(b % 2 == 0){
      System.out.print("Even");
        return;
    }
    
    System.out.print("Odd");
  }

}
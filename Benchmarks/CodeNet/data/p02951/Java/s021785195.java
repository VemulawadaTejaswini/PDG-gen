import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // a
    int limit = sc.nextInt();
    // b
    int container1 = sc.nextInt();
    // c
    int container2 = sc.nextInt();

    int residual = container1 + container2 - limit;
    int result = residual < 0 ? 0 : residual; 
    System.out.print(result);
  }
}
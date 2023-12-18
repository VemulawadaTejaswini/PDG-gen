import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    if(N == 1)
      System.out.println("Hello World");
    else{
      scan = new Scanner(System.in);
      int A = scan.nextInt();
      scan = new Scanner(System.in);
      int B = scan.nextInt();
      System.out.println(A + B);

    }
  }
}

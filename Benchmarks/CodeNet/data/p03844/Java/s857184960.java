import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    String op = sc.next();
    int B = sc.nextInt();


    System.out.println( "+".equals(op) ? A + B : A - B  );
  }
}

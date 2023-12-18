import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    boolean result = A <= 8 && B <= 8 ;
    System.out.println( result ? "Yay!" : ":(");
    
    }
}

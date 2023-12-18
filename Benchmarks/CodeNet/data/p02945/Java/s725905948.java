import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int Number1 = sc.nextInt();
    int Number2 = sc.nextInt();
    int answer1= Number1+ Number2;
    int answer2 =Number1-Number2;
    int answer3 = Number1 * Number2;
    
    System.out.println(Math.max(answer1,answer2,answer3));
   
  }
}
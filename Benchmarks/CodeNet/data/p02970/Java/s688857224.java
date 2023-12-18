import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int D = scan.nextInt();
    
    if(N%(2*D+1) == 0){
      System.out.println(N/(2*D+1));
    } else {
      System.out.println(N/(2*D+1)+1);
    }
  }
}
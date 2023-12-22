import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int D = scn.nextInt();
    int T = scn.nextInt();
    int S = scn.nextInt();
    
//    System.out.println(D);
//    System.out.println(T);
//    System.out.println(S);
  	
    if ((T * S) < D) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
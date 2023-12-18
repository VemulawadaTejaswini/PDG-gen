import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);


      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();


      int w = A-B-C;

      if(A>=B+C){
        System.out.print(0);
      }else{
        System.out.print(Math.abs(w));
      }

  }
}

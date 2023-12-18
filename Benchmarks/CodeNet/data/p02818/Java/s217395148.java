import java.util.*;
public class Main2{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      long a = sc.nextLong();
      long b = sc.nextLong();
      long k = sc.nextLong();


      for (long i = 0;i<k ;i++ ) {
        if (a>0) {
          a -= 1;
        }else if (b>0) {
          b -= 1;
        }

      }
      System.out.print(a);
      System.out.print(" ");
      System.out.print(b);
      System.out.println();
    }
}

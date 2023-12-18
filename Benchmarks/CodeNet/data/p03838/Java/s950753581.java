import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long x = sc.nextLong();
      long y = sc.nextLong();

      if(x == y)
        System.out.println(0);
      else if(x*(-1) == y) 
        System.out.println(1);
      else if(x < y) 
        System.out.println(y - x);
      else{
          if(x == 0 || y == 0 || (x / y < 0))
            System.out.println(Math.abs(Math.abs(x) - Math.abs(y)) + 1);
          else
            System.out.println(Math.abs(Math.abs(x) - Math.abs(y)) + 2);
      }
  }
}
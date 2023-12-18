import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt() + sc.nextInt() - sc.nextInt() - sc.nextInt();
      if(a == 0)
        System.out.println("Balanced");
      else if (a > 0)
       System.out.println("Left");
      else
        System.out.println("Right");
  }
}
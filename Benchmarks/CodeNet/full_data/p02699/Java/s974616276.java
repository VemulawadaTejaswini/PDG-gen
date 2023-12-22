import java.util.*;
public class Test{ 
  public static void main(String args[]) {
    Scanner s1 = new Scanner(System.in);
    int s = s1.nextInt();
    int w = s1.nextInt();
    if(w>s) 
      System.out.println("unsafe");
    else 
      System.out.println("safe");
    }
  }
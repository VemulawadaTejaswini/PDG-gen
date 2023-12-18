import java.util.*;
class Test{ 
  public static void main(String args[]) {
    Scanner s1 = new Scanner(System.in);
    int S = s1.nextInt();
    int W = s1.nextInt();
    if(W>S) 
      System.out.println("unsafe");
    else
      System.out.println("safe");
    }
  }
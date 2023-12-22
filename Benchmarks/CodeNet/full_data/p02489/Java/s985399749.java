import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int i = 1;
    for(;;){
      int a = in.nextInt();
      System.out.printf("case %d: %d\n", i, a);
      if (a == 0) break;
      i++;
    }
  }
}
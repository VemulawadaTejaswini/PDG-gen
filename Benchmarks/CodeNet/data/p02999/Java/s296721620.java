import java.util.*;

class Main{
  public static void main(String[]args){
    Random random = new Random();
    int X = random.nextInt(10);
    int A = random.nextInt(10);
    if(X < A){
      System.out.println(0);
    }else if(A <= X){
      System.out.println(10);
    }
  }
}
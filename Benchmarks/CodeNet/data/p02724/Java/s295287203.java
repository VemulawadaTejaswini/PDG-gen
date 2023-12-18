import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    
    int X_500 = X / 500;
    if (X%500 > 0){
      int X_5 = (X - X_500*500)/5;
      System.out.println(X_500*1000+X_5*5);
    }
    else
      System.out.println(X_500*1000);
    
  }
}
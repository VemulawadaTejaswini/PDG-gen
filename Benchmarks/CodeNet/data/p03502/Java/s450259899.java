import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = X;
    int N = 0;
    while(Y > 0){
      N += Y%10;
      Y /= 10;
    } 
    System.out.println(X%N==0 ? "Yes" : "No");
  }
}
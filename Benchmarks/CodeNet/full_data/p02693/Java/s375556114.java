import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	final int X = sc.nextInt();
    int X2 = X;
    int A = sc.nextInt();
    int B = sc.nextInt();
      while(X2 <= 1000){
        if(X2 >= A && X2 <= B){
          System.out.println("OK");
          return;
        }
        X2 += X;
        
      }
      System.out.println("NG");
	}
}

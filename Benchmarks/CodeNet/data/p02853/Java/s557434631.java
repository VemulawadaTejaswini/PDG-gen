import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a1 = 300000;
    int a2 = 200000;
    int a3 = 100000;
    int ex = 400000;
    
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int ans = 0;
    if(X == 1){
      ans += a1;
    }else if(X == 2){
      ans += a2;
    }else if(X == 3){
      ans += a3;
    }
    
    if(Y == 1){
      ans += a1;
    }else if(Y == 2){
      ans += a2;
    }else if(Y == 3){
      ans += a3;
    }
    
    if(X == 1 && Y == 1){
      ans += ex;
    }
    System.out.println(ans);
  }
}
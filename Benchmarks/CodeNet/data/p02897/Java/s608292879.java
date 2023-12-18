import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double ans = 0.0;
    if(N % 2 == 0){
      ans = 0.5;
    }else{
      ans = (double)((N/2)+1)/N;
    }
    System.out.println(ans);
  }
}

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double x1 = (double)n/1.08;
    double x2 = (int)x1;
    if(x1==x2){
      System.out.println((int)x1);
    }else{
      int ans = (int)((int)(x2+1) * 1.08);
      if(ans==n){
        System.out.println((int)(x2+1));
      }else{
        System.out.println(":(");
      }
    }

  }
}

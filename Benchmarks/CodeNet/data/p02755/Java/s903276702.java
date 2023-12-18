import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

  double x1_min = ((double)a *12.5);
  double x1_max = (double)((a+1)*12.5);

  double x2_min = 10 * b;
  double x2_max = 10 * (b+1);
  int p = 0;
  int q = 0;
  if(x1_min>x2_min){
    p = (int)x1_min;
  }else{
    p = (int)x2_min;
  }

  if(x1_max>x2_max){
    q = (int)x2_max;
  }else{
    q = (int)x1_max;
  }

  if(p>q){
    System.out.println("-1");
  }else{
    if(x1_min<x2_min){
      System.out.println((int)(x2_min+(x2_min-1)/x2_min));
    }else if(x1_min>=x2_min){
      System.out.println((int)(x1_min+(x1_min-1)/x1_min));
    }
  }
}
}
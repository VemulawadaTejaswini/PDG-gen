import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

  int x1_min = (int)((double)a *12.5);
  int x1_max = (int)((double)(a+1)*12.5);

  int x2_min = 10 * b;
  int x2_max = 10 * (b+1);
  int p = 0;
  int q = 0;
  if(x1_min>x2_min){
    p = x1_min;
  }else{
    p = x2_min;
  }

  if(x1_max>x2_max){
    q = x2_max;
  }else{
    q = x1_max;
  }

  if(p>q){
    System.out.println("-1");
  }else{
    System.out.println(p);
  }
}
}
import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    for(int i=0 ; i<=1000 ; i++){
      int a1 = (int)(i*0.08);
      int b1 = (int)(i*0.1);
      if(a1==a && b1==b){
        System.out.println(i);
        break;
      }else if(a1>a || b1>b){
        System.out.println(-1);
        break;
      }
    }
  }
}

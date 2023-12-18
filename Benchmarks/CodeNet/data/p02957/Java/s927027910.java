import java.util.*;
public class Main{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  if(a>b){
    int x = a%b;
      if(x==0){
        int ak = (a-b)/2;
        int k = a-ak;
      }else{
        System.out.println("IMPOSSIBLE");
      }
  }else{
    int x = b%a;
      if(x==0){
        int bk = (b-a)/2;
        int k = b-bk;
      }else{
        System.out.println("IMPOSSIBLE");
      }
    }
  }
}


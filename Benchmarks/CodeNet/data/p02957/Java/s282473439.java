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
    }else if(x==1){
    System.out.println("IMPOSSIBLE");
    }
  }else if(a<b){
    int x = b%a;
    if(x==0){
    int bk = (b-a)/2;
    int k = b-bk;
    }else if(x==1){
    System.out.println("IMPOSSIBLE");
    }
  }
 }
}
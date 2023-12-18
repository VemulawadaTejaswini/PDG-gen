import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt(),a = sc.nextInt(),b = sc.nextInt();
    int dis;
    if(a < b){
      dis = b-a;
    }else{
      dis = a-b;
    }
    if(dis <= w){
      System.out.println(0);
    }else{
      System.out.println(dis - w);
    }
  }
}

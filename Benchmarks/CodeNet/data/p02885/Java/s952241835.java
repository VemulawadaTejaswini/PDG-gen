import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = A - B*2;
    if (ans < 0){
      System.out.println(0);
    }else{
      System.out.println(ans);
    }
  }
}
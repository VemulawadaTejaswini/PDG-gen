import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n == 0){
      System.out.println(2);
      return;
    }
    if(n == 1){
      System.out.println(1);
      return;
    }
    long ans0 = 2,ans1 = 1,ans2 = 0;
    for(int i = 2;i<=n;i++){
      ans2 = ans1 + ans0;
      ans0 = ans1;
      ans1 = ans2;
    }
    System.out.println(ans2);
  }
}

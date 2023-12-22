import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = 1l;
    for(int i = 0;i<n;i++){
      long a = sc.nextLong();
      ans *= a;
      if(ans > Math.pow(10,18)){
        System.out.println("-1");
        return;
      }
    }
    if(ans > 1000000000000000000l){
      System.out.println("-1");
      return;
    }
    System.out.println(ans);
  }
}


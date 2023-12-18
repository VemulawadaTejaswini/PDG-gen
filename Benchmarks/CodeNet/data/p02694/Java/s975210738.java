import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = 100;
    long ans = 0;

    for(int i=1 ; i<=10000 ; i++){
      y = (long)(y*(1.01));
      if(y>=x){
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}

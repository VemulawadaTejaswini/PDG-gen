import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    if(n < 2 && n > 100000){
      n = sc.nextInt();
    }
    long x = 0L;
    long goukei = 0L;
    for(int i = 1 ; i <= n ; i++){
      x = sc.nextLong();
      if(x < 0L && x >1000000000000000000L){
        x = sc.nextLong();
      }
      if(i == 1){
        goukei = x;
      }else{
        goukei = goukei * x;
      }
    }
    if(goukei > 1000000000000000000L){
      System.out.println("-1");
    }else{
      System.out.println(goukei);
    }
    
  }
}
      
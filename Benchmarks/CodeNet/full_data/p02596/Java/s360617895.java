import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    if(k%2==0){
      System.out.println(-1);
      return;
    }
    if(k==7){
      System.out.println(1);
      return;
    }else if(k%7==0){
      k/=7;
    }
    long seven = 1;
    int ans = 1;
    while(seven%k!=0){
      seven*=10;
      seven++;
      ans++;
    }
    System.out.println(ans);
  }
}

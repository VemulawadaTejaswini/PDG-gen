import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    if(k%2==0){
      System.out.println(-1);
      return;
    }
    long b = 7l;
    int count = 1;
    while(count<10000000){
      if(b%k==0){
        System.out.println(count);
        return;
      }
      b*=10;
      b+=7;
      b%=k;
      count++;
    }
    System.out.println(-1);

  }
}

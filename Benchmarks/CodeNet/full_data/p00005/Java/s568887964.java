import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a,b,i,lcm,gcd;
    while(sc.hasNext()){
      a = sc.nextInt();
      b = sc.nextInt();
      gcd = 1;
      for(i = 1;i <= Math.min(a,b);i++){
        if(a % i == 0 && b % i == 0)gcd = i;
      }
      lcm = a / gcd * b ;
      System.out.println(gcd + " " + lcm);
    }
  }
}
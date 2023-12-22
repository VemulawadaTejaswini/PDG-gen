import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a,b,i,lcm,gcd;
    while(sc.hasNext()){
      a = sc.nextInt();
      b = sc.nextInt();
      lcm = 1;
      for(i = 1;i <= Math.min(a,b);i++){
        if(a % i == 0 && b % i == 0)lcm = i;
      }
      gcd = a * b / lcm;
      System.out.println(gcd + " " + lcm);
    }
  }
}
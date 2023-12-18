import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int lcm = sc.nextInt();
    int a = 1;
    int b = 1;
    int c = 1;
    int gcd = 0;
    int num = 0;
    for(int i=1;i<N;i++){
      c = lcm;
      num = sc.nextInt();
      a = num;
      while(b!=0){
        gcd = b;
        if(a>=c){
          b = a-c;
          a = c;
          c = b;
        }else{
          b = c-a;
          c = a;
          a = b;
        }
      }
      lcm = lcm*num/gcd;
    }
    System.out.println(lcm);
  }
}
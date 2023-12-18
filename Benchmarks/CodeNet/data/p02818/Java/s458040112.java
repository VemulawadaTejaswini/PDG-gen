import java.util.*;
class Main{
  public static void main(String[] args){
  	Scanner sc= new Scanner(System.in);
    long a= sc.nextLong();
    long b= sc.nextLong();
    long k= sc.nextLong();
    long temp= Math.subtractExact(k,a);
    if (temp>0){
      b= Math.subtractExact(k,b);
      System.out.print(a+" ");
      if (b<0) {
        System.out.print(0);
      }
      System.out.print(b);
    }
    if (temp==0){
      System.out.print(a);
      System.out.print(" "+b);
    }
    if (temp<0){
      System.out.print(a-k);
      System.out.print(" "+b);
    }
  }
}
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long a =sc.nextLong();
    long b =sc.nextLong();
    long c =sc.nextLong();
    long d =sc.nextLong();
    long e =a*c;
    long f =b*d;
    if(e<f){System.out.println(e);}
    else{System.out.println(f);}
  }
}
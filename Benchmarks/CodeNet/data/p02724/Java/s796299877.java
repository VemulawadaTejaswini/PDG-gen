import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long x =sc.nextInt();
    long y =x/500;
    long z =x/5-100*y;
    System.out.println(1000*y+5*z);
  }
}
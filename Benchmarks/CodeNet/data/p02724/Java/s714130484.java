import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long t = sc.nextInt();
    long h = t/500;
    long g = t%500;
    long ans = h*1000+g*5;
    System.out.println(ans);
  }
}
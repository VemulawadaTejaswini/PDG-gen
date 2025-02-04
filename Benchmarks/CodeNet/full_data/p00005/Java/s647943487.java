import java.util.*;
public class Main{
 void run() {
  Scanner sc = new Scanner(System.in);
  for(;sc.hasNext();){
   int a = sc.nextInt();
   int b = sc.nextInt();
   System.out.println( gcd(a, b) + " " + lcm(a, b) );
  }
 }
 int gcd(int a, int b){
  if(b==0) return a;
  return gcd(b, a%b);
 }
 int lcm(int a, int b){
  return a/gcd(a, b)*b;
 }
 public static void main(String[] args){
  new Main().run();
 }
}
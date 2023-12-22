import java.util.*;
class Main{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  long x=Math.abs(sc.nextLong());
  long k=sc.nextLong();
  long d=sc.nextLong();
  if(k-x/d<=0){
    System.out.println(x-k*d);
  }else{
  k-=x/d;
  System.out.println(k%2==0?x-d*(x/d):Math.abs(x-d*(x/d)-d));}
}
}

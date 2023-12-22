import java.util.*;
class Main{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  long x=Math.abs(sc.nextLong());
  long k=sc.nextLong();
  long d=sc.nextLong();
  if(k>((double)x)/d){
 	x=x-(d*(x/d));
    k-=x/d;
    if((x/d)*d==x)k++;
    if(k%2==1){
    x=Math.abs(x-d);
    }System.out.println(x);
  }else{
  System.out.println(x-k*d);
  }
}
}

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=sc.nextLong();
    long d =(c - a - b) * (c - a - b) - 4*a*b;
    if((a + b < c)&&(d>0)){System.out.println("Yes");}
    else{System.out.println("No");}
  }
}

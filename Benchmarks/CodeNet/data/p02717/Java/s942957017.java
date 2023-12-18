import java.util.*;
import java.lang.*;
public class Main{
public static void main(String []args){
long n,k,min;
  Scanner sc=new Scanner(System.in);
  n=sc.nextLong();
  k=sc.nextLong();
  min=Math.min(k,n%k);
  min=Math.min(min,k-(n%k));
  System.out.println(min);
}
}

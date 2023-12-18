import java.util.*; 
import java.math.*;
class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  
  int a=sc.nextInt();
  int b=sc.nextInt();
  //int c=sc.nextInt();
  int sum=a+b;
  int sub=a-b;
  int mul=a*b;
  int ans = Math.max(sum,sub);
  System.out.println(Math.max(ans,mul));
  //System.out.println(ans);
  
}
}

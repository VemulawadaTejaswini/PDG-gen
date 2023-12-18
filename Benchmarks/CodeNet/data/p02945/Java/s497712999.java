import java.util.*;
public class Main{
public static void main(String args[])
{
  Scanner sp=new Scanner(System.in);
   int a=sp.nextInt();
    int b=sp.nextInt();
 int add=a+b;
 int sub=a-b;
 int mul=a*b;
 
 
if(sub<=add &&  mul<=add)
 {
     System.out.println(add);
 }
 if(sub>=add && sub>=mul)
 {
     System.out.println(sub);
 }
 else{
     System.out.println(mul);
 }
}
}
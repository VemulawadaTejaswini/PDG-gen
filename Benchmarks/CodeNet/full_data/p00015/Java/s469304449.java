import java.util.Scanner;
 import java.math.*;


 class Main{

 public static void main(String args[]){

 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();

  BigInteger b=new BigInteger("0");
  BigInteger c=new BigInteger("0");

  for(int i=1;i<=a;i++){

  b=sc.nextBigInteger(); 
  c=sc.nextBigInteger();


   if((b.toString().length()>80)||(c.toString().length()>80)||(b.add(c).toString().length()>80))

     System.out.println("overflow");
   else
 
    System.out.println(b.add(c));  
   }
  }
 }
package com.mycompany.mavenproject;
import java.math.BigInteger;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in)   ;  
   BigInteger a =in.nextBigInteger();
    BigInteger b =in.nextBigInteger();
    BigInteger c=a.max(b);
   if(a.equals(b))System.out.println("EQUAL");
   else if(c.equals(b))System.out.println("LESS");
   else System.out.println("GREATER");
   

          
}
}




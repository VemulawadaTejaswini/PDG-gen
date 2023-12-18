/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author Admin
 */
class Main {
    
    
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    
    String str=s.next();
     BigInteger ll=new BigInteger("2019");
    
     int count=0;
    for(int i=0;i<str.length();i++)
    {
    for(int j=i+1;j<=str.length();j++)
    {
       BigInteger bi=new BigInteger(str.substring(i,j));
      //  System.out.println(bi);
       if( bi.mod(ll).intValue()==0)
       {
           count++;
       }
           
    
    }
    }
    System.out.println(count);
  
    
    }
    
    
}

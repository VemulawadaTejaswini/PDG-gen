import java.util.Scanner;

class Alphabets{
 
Scanner sc=new Scanner(System.in);
  
  String c=sc.next();
 
  
 // String s=c.toLowerCase();
  
  if(c.isLowerCase()){
  
  	c=c.toUpperCase();
  System.out.println(c);
  }
  else{ 
  c=c.toLowerCase();
    System.out.println(c);
  }
 

}
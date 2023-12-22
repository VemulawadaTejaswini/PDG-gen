import java.util.Scanner;

class Alphabets{

Scanner sc=new Scanner(System.in);
  
  char c=sc.nextChar();
  
  if(c.isLower()){
  
  	c=c.toUpper();
  System.out.println(c);
  }
  else{ 
  c=c.toLower();
    System.out.println(c);
  }

\
}
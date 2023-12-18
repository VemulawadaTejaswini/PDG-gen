import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  String po=sc.next();
  int length=po.length();
  String p=po.replace("01","").replace("10","");
  while(length!=p.length())
  {length=p.length();
      p=p.replace("01","").replace("10","");}
  System.out.println((po.length()-p.length()));
}
}

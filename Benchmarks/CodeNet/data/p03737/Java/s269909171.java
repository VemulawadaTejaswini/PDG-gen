import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    String c=sc.next();
    String aa=a.substring(0,1).toUpperCase();
    String bb=b.substring(0,1).toUpperCase();
    String cc=c.substring(0,1).toUpperCase();
    System.out.println(aa+bb+cc);
  
  }
}
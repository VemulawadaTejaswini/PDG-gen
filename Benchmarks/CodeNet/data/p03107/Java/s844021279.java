import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  String po=sc.next();
  System.out.println((po.length()-po.replace("00","").replace("11","").length())/2);
}
}

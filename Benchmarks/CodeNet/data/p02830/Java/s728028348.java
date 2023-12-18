import java.util.*;

public class Main{
  public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();
    String C="";
for(int i=0;i<A.length;i++){
  String C=C+A.charAt(i)+B.charAt(i);
}
  System.out.println(C);
  }
}

                  

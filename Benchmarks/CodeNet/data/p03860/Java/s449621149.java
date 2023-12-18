import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    String s[]=new String[3];
    for(int i=0;i<3;i++){
      s[i]=sc.next();
    }
    for(int i=0;i<3;i++){
      System.out.print(s[i].charAt(0));
    }
    System.out.println("");
    
  }
}
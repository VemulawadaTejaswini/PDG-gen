import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String k[]=s.split(",");
    for(int i=0;i<k.length;i++){
      System.out.print(k[i]+" ");
    }
    System.out.println("");
    
  }
}
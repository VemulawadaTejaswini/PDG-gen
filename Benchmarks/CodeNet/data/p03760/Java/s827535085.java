import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    String o=sc.next();
    String e=sc.next();
    char oo[]=new char[o.length()];
    char ee[]=new char[e.length()];
    for(int i=0;i<o.length();i++){
      oo[i]=o.charAt(i);
    }
    for(int i=0;i<e.length();i++){
      ee[i]=e.charAt(i);
    }
    for(int i=0;i<e.length();i++){
      System.out.print(oo[i]+""+ee[i]);
    }
    if(o.length()!=e.length()){
      System.out.print(oo[o.length()-1]);
    }
    System.out.println("");
    sc.close();
  }
}
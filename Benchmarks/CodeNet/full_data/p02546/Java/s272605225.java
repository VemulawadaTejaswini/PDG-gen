import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    char[] c=s.toCharArray();
    if(c[c.length()-1]=='s'){
      System.out.println(s+"es");
    }else{
      System.out.println(s+"s");
    }
  }
}
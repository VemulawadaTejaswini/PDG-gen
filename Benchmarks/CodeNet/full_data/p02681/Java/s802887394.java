import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String s=sc.next(),t=sc.next(),f;
    int n=s.length();
    char a=t.charAt(n);
    f=String.valueOf(a);
    if(t.equals(s+f)){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}
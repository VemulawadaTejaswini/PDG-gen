import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    String t=sc.next();
    String a="";
    for(int i=0;i<n;i++){
      a+==s.substring(i,i+1);
      a+==t.substring(i,i+1);
    }
    System.out.println(a);
  }
}
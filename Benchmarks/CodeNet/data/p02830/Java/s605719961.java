import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    String t=sc.next();
    char[] c=new char[2*n];
    for(int i=0;i<n;i++){
      c[2*i]=s.substring(i,i+1);
      c[2*i+1]=t.substring(i,i+1);
    }
    System.out.println(c.toString());
  }
}
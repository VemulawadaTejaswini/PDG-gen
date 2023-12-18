import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    if(n==1){
      System.out.println("()");
      return;
    }else if(n==2&&(s.equals("((")||s.equals("))"))){
      System.out.println("(())");
      return;
    }else if(n==2&&s.equals("()")){
      System.out.println("()");
      return;
    }else if(n==2){
      System.out.println("()()");
      return;
    }
    int cnt = 0;
    int r = 0;
    int l = 0;         
    for(int i = 0;i < n-2;i++){
      if(s.substring(i,i+2).equals("()"))cnt++;
    }
    for(int i = 0;i < n;i++){
      if(s.charAt(i)=='(')l++;
      else r++;
    }
    for(int i = 0;i < r-cnt;i++)System.out.print("(");
    System.out.print(s);
    for(int i = 0;i < l-cnt;i++)System.out.print(")");
    System.out.println("");
  }
}
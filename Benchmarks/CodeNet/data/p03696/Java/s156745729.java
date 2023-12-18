import java.util.*;
import java.io.*;

class Main{
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int count1=0;
    for(int i=0;i<n;i++){
      if(s.charAt(i)=='('){
        count1++;
      }else if(count1>0){
        count1--;
      }
    }
    int count2=0;
    for(int i=n-1;i>=0;i--){
      if(s.charAt(i)==')'){
        count2++;
      }else if(count2>0){
        count2--;
      }
    }
    for(int i=0;i<count2;i++){
      out.print("(");
    }
    out.print(s);
    for(int i=0;i<count1;i++){
      out.print(")");
    }
    out.println();
    out.flush();
  }
}
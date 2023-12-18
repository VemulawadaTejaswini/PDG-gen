import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<t.length();i++)sb.append(s);
    int ans = -1;
    for(int i=0;i<t.length();i++){
      String x = t.substring(i,i+1);
      if(s.indexOf(x)<0){
        System.out.println(-1);
        return;
      }
      ans=sb.indexOf(x,ans+1);
    }
    System.out.println(ans+1);
  }
}
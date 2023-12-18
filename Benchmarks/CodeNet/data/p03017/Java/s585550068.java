import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt()-1;
    int b = sc.nextInt()-1;
    int c = sc.nextInt()-1;
    int d = sc.nextInt()-1;
    String ss = sc.next();
    int cd = Math.max(c,d);
    String s = ss.substring(a,cd+1);
    if(s.contains("##")){
      System.out.println("No");
      return;
    }
    if(c<d){
      System.out.println("Yes");
    }else{
      s = ss.substring(b-1, Math.min(ss.length(),d+2));
      if(s.contains("...")){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}

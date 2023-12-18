import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    boolean flag = false;
    if(s == t){
      flag = true;
    }
    for(int i=0;i<s.length()-1;i++){
      String[] c = s.split("");
      String tmp = c[c.length-1];
      for(int j=c.length-1;j>0;j--){
        c[j] = c[j-1];
      }
      c[0] = tmp;
      s = String.join("",c);
      System.out.println(s);
      if(s.equals(t)){
        flag = true;
        break;
      }
    }
    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}
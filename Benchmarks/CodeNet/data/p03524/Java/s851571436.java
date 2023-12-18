import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = 0,b = 0,c = 0;
    for(int i = 0;i<s.length();i++){
      if (s.substring(i,i+1).equals("a")) {
        a++;
      }else if (s.substring(i,i+1).equals("b")) {
        b++;
      }else{
        c++;
      }
    }
    int max = Math.max(a,Math.max(b,c));
    int min = Math.min(a,Math.min(b,c));
    if (max-min<=1) {
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}

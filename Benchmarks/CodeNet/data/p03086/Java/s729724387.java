import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      char c;
      int count = 0;
      int ans = 0;

      for (int i = 0;i<s.length() ;i++ ) {
        c = s.charAt(i);
        if(c=='A'||c=='C'||c=='G'||c=='T'){
          count++;
        }else{
          ans = Math.max(ans,count);
          count=0;
        }
      }

      System.out.println(ans);
      }
    }

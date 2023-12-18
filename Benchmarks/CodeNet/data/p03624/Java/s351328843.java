import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      String s = sc.next();
      char [] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      int i;
      int n;
      for(i=0;i<26;i++){
        for(n=0;n<s.length();n++){
          if(s.charAt(n)==alpha[i]){
          }else{
            i=n+1;
          }
        }
        if(i>25){
          System.out.println("None");
          System.exit(0);
        }
      }
      System.out.println(alpha[i]);

  }
}

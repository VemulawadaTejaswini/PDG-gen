import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      String n = sc.next();
      StringBuffer N = new StringBuffer(n);
      String ren = N.reverse().toString();
      int total = 0;
      if(n.length()%2==0){
        for(int i=0;i<n.length();i++){
          if(n.charAt(i)!=ren.charAt(i)){
            total++;      
          }
        }
      }else{
        for(int i=0;i<n.length();i++){
          if(n.charAt(i)!=ren.charAt(i)){
            total++;      
          }
        }
      }
      System.out.println(total/2);

  }
}

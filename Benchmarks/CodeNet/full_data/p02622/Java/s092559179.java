
import java.util.*;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      int count =0;
      for(int i=0;i<s.length();i++){
         outer: for(int j =i;j<s.length();j++){
              if(s.charAt(i)!=t.charAt(j)){
                  count++;
               break outer;
              }else{
                  break outer;
              }
          }
      }
      System.out.println(count);
        
    


}

    }
    

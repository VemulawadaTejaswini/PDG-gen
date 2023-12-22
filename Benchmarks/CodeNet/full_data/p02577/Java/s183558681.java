import java.util.*;
import static java.lang.System.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
      String s = sc.next();
      int sum = 0;
      
      for(int i=0; i<s.length(); i++){
        sum = sum + (int)s.charAt(i);
      }
    if(sum % 9 ==0){
      out.println("Yes");
}else{
      out.println("No");
    }
}
}
import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
   
    System.out.println(c(s));
    
  }
  
  //再帰
  static Long c(String s){
    Long num = Long.parseLong(s);

    for(int i = 1 ; i < s.length() ; ++i){
      String s_l = s.substring(0, i);
      Long num_l = Long.parseLong(s_l);
      num += num_l * (int)Math.pow(2,(s.length()-i-1));
      String s_r = s.substring(i);
      num += c(s_r);
     
    }
    return num;
  }
}

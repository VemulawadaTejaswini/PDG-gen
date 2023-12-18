import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int leg = s.length();
    String s_l = s.substring(0,leg/2);
    String s_r = s.substring(leg/2);

    int c_l = 0;
    int c_r = leg/2-1;
    
    int count = 0;
    
    for(int i = 0 ; i < leg/2 ; ++i){
      if(s_l.charAt(c_l) != s_r.charAt(c_r)){
        count++;
      }
      c_l++;
      c_r--;
    }
    
    if(leg%2==0 ||count==0){
      System.out.println(count);
    }else{
      System.out.println(count-1);
    }
  }
}

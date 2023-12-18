import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   	String s = sc.next();
    int count = s.length() - 1;
    int count1 = (s.length()-1)/2 -1;
    int count2 = (s.length()+3)/2 -1;
    boolean ro = true;
	
    for(int i = 0; i < s.length() && ro;i++){
      if(s.charAt(i) != s.charAt(count - i)) ro = false;
      if(i <= count1){
        if(s.charAt(i) != s.charAt(count1 - i)) ro = false;
      }
      if(i >= count2){
        if(s.charAt(i) != s.charAt(count + count2 - i)) ro = false;
      }
    }
    
    if(ro) System.out.println("Yes");
    else System.out.println("No");

  }
}

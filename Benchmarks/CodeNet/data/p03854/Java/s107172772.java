import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] list = {"dream", "dreamer", "erase", "eraser"};
    
    while(s.length() >= 5){
      for(String str : list){
          if(s.endsWith(str)){
          	s = s.substring(0, s.length() - str.length());
          }
      }
      
      if(!s.endsWith("dream")&& !s.endsWith("dreamer")&& !s.endsWith("erase")&& !s.endsWith("eraser")){
            
			break;
      }
    }
    if(s.length() == 0){
		System.out.println("YES");
    } else {
      	System.out.println("NO");
    }
    
  }
}
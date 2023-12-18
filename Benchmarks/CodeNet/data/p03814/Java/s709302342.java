import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
        
        String S = scan.next();
        
        boolean isBetween = false;
        int count = 0;
        int cnt = 0;
        int i = 0;//for iの代り
        
        String[] strArray = S.split("");
		for(String s_one : strArray) {
          
          i++;
          
		  if(s_one.charAt(0) == 'A' && isBetween == false){
            isBetween = true;
            count++;
          }
          else if(isBetween == true){
            count++;
          }
          
          if(s_one.charAt(0) == 'Z' && isBetween == true && S.substring(i, S.length() ).contains("Z") == false  ){
            isBetween = false;
            if(cnt < count)cnt = count;
            count = 0;
          }
		}
        
        System.out.println(cnt);
	  }
}
import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int len = s.length();
      
	  int cnt = 0;
      boolean start = false;
      for(int i=0; i<len; i++){
        String str = s.substring(i,i+1);
        if("A".equals(str)){
            start = true;
        }
        if (start){
	    	cnt += 1;
        } else {
          continue;
        }  
        if("Z".equals(str)){
            break;
        }
      }  
      System.out.println(cnt);
    }  
}  
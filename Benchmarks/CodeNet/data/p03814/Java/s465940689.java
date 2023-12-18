import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      char[] array = s.toCharArray();
      int first = 0;
      int end = s.length();
      for(int i = 0;i < end;i++){
      	if(s.substring(i,i+1).equals("A")){
          first = i+1;
          break;
        }
      }
      for(int i = end;i > 0;i--){
      	if(s.substring(i-1,i).equals("Z")){
        	end = i;
          break;
        }
      }
      System.out.println(end-first+1);
    }
}

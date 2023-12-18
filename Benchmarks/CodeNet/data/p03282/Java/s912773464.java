import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      long k = sc.nextLong();
      for(int i = 0;i < s.length();i++){
      	if(s.substring(i,i+1).equals("1")&&k==i+1){
        	System.out.println(1);
            return;
        }
        else if(!(s.substring(i,i+1).equals("1"))){
        	System.out.println(s.substring(i,i+1));
            return;
        }
      }
      System.out.println(1);
    }
}

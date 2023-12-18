import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      boolean p = true;
      int n = 0;
      s = s.substring(0,s.length()-1);
      while(p){
        s = s.substring(0,n-1);
      	n = s.length();
        if(n%2==0 && s.substring(0,n/2).equals(s.substring(n/2,n)) ) p = false;
      }
      System.out.println(s.length());
    }
}

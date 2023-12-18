import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String o = sc.next();
      String e = sc.next();
      for(int i = 0;i < e.length();i++){
      	System.out.print(o.substring(i,i+1));
        System.out.print(e.substring(i,i+1));
      }
      if(o.length()%2!=0) System.out.print(o.substring(o.length()-1,o.length()));
    }
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String s = sc.next();
      boolean t = false;
      for(int i = 3;i<s.length();i+=2){
         if(s.charAt(i-1)==s.charAt(i)){
            t = true;
         }
      }
      if(t){
          System.out.println("Yes");
       }else{
         System.out.println("No");
         
      }
	}
}
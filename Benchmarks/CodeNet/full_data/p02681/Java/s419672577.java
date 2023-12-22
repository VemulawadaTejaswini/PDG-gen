import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      String t = sc.next();
      boolean juage = false;
      for(int  i = 0;i<s.length();i++){
         if(s.charAt(i)!=t.charAt(i)){
            System.out.println("No");
         }
         if(s.charAt(i)==t.charAt(i)){
            juage = true;
         }
         else{
            juage = false;
            break;
         }
      }
         if(juage){
            if(s.length()+1==t.length()){
               System.out.println("Yes");
            
         }
      }
   }
}
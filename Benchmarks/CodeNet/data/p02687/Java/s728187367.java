import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      String s1 = "ABC";
      String s2 = "ARC";
      boolean t1 = false;
      boolean t2 = false;
		for(int i = 0;i<s.length();i++){
         if(s.charAt(i)==s1.charAt(i)){
            t1 = true;
         }
         if(s.charAt(i)==s2.charAt(i)){
            t2 = true;
         }
      }
       if(t1){
          System.out.println(s2);
           }
       if(t2){
          System.out.println(s1); 
          }
	}
}
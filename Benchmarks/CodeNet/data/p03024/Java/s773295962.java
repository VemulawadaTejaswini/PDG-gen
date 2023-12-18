import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		char[] s_chars = s.toCharArray();
        int x = s.length();
        int nam = 0;
      
      for(int i=0;i<x;i++){
        if(s_chars[i]=='x'){
          nam++;
        }
      }
      if(nam<=7){System.out.print("YES");}
      else{System.out.print("NO");}
        
     
	}
}
import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
      	int nam = s.length();
      	char[] s_chars = s.toCharArray();
          
      	HashSet<Character> hs = new HashSet<Character>();
      for(int i =0;i < nam ;i++){
		hs.add(s_chars[i]);
      }
      
      nam = hs.size();
      char mo = 'a';
      int flag = 0;
      
      for(int i = 0;i < nam;i++){
      if(hs.contains(mo)){
        mo++;
      }else{
         flag = 1;
         break;
           }
      }
        
      if(flag==1){System.out.print(mo);}
      else{System.out.print("None");}
      
	}
}
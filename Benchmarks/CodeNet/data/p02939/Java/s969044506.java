import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
      	char[] s_chars = s.toCharArray();
       	int nam = s.length();
      
      int count = 0;
      for(int i = 0;i < nam-1;i++){
      if(s_chars[i]==s_chars[i+1]){count++;}
      }
     
      System.out.print(nam-count+1);
	}
}
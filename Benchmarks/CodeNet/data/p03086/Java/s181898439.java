import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
      	int nam = s.length();
		char[] c = s.toCharArray();
        
      int count = 0;int memo = 0;
      for(int i =0;i < nam;i++){
      if(c[i]=='A'||c[i]=='C'||c[i]=='G'||c[i]=='T'){count++;}
      else{
        memo = Math.max(memo,count);
        count = 0;  
          }
      }
      System.out.print(memo);
	}
}
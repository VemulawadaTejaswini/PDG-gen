
import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int s_nam = s.length();
		int s_center = (s_nam-1)/2;
		char[] s_chars = s.toCharArray();
		int flag1 = 0;
		int flag2 = 0;
		int flag3 = 0;
        
        
        flag1 = gcd(0,s_nam-1,s_chars);
        flag2 = gcd(0,s_center-1,s_chars);
        flag3 =  gcd(s_center+1,s_nam-1,s_chars);

        
       if(flag1+flag2+flag3 == 0){System.out.println("Yes");}
        else{System.out.println("No");}
	}
      
      
	static int gcd(int a, int b, char[] kaibun) {
 
	    int reza = 0;
	    
        for(int i = a;i<=b; i++){
            if(kaibun[i] != kaibun[b-i] ){
                reza = 1;
            }
        }
        return reza;
	}
	
    
}
	
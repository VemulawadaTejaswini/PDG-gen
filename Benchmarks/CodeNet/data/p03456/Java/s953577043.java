import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);		
		String N = in.next();
        String M = in.next();
      
      	int nam = Integer.parseInt(N+M);
        double nam2 = Math.sqrt((double)nam);
      
        if(nam2%1==0){System.out.print("Yes");}
        else{System.out.print("No");}
      
      }
	}
import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		long L = in.nextLong();
        long R = in.nextLong();
      
      if(L>=2019){System.out.print((L*(L+1))%2019);}
      else if(R<=2019){System.out.print((R*(R-1))%2019);}
      else{System.out.print(2);}
     
	}
}
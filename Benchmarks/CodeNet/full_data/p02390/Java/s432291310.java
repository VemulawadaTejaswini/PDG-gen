
import java.util.*;

class Main {
		public static void main (String[]agrs){
			int s;
			int m;
			int h;
			Scanner sc = new Scanner(System.in);
			 s =sc.nextInt();
			 m =s/60;
			 h=m/60;
			 s=s%60;
			 m=m%60;
			 h=h%60;
			 System.out.println(h+":"+m+":"+s);
			 
			
		
	 
	}

}
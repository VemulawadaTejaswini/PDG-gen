import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		
      	int h = sc.nextInt();
      	int n = sc.nextInt();
      	int dm = 0;
      	String str = "No";
      
      	for(int i = 0;i < n && h > 0;i++) {
			h -= sc.nextInt();        
        }
      	
      	if(h <= 0) str = "Yes";      	
      	
      	System.out.println(str);
        
	}
}

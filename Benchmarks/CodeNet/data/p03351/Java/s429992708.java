import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int a = sc.nextInt(); 
      	int b = sc.nextInt(); 
      	int c = sc.nextInt(); 
      	int d = sc.nextInt(); 
      	String str = "No";
      	
      	if((Math.abs(a-b) <= d && Math.abs(b-c) <= d) || Math.abs(c-a) <= d) str = "Yes";
      	
      	
      	System.out.println(str);
        
	}
}

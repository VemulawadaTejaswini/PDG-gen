import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int n = sc.nextInt();
      	String s = sc.next();
      	String t = sc.next();
      	char chs[] = new char[2*n];
      	String st;
      
      	for(int i = 0;i < n;i++){
        	chs[2*i] = s.charAt(i);
          	chs[2*i+1] = t.charAt(i);
        }        
        st = new String(chs);  	
      	
      	System.out.println(st);
        
	}
}

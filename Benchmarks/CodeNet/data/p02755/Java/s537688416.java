import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	
      	a *= 100;
      	if((a/100)%2==0) a+=2;
      	b *= 100;
      
      	boolean b1 = (a+96)*100/8 < b*100/10;
      	boolean b2 = (b+90)*100/10 < a*100/8;
      	boolean b3 = a/100/8 < b/100/10;
      
      	if(b1 || b2) System.out.println(-1);
      	else if(b3) System.out.println(b*100/10/100);
        else if(!b3) System.out.println(a*100/8/100);         
        
	}
}

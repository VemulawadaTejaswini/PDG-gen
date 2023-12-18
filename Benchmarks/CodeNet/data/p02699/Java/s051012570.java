import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
      	boolean twin = false;
      	boolean awin = false;
      	String str = " ";
      
      	for(int i = 0;!twin && !awin;i++) {
			if(i % 2 == 0){
              c -= b;
              if(c <= 0) {
                twin = true;
              	str = "Yes";
              }
            } else {
              a -= d;
              if(a <= 0) {
                awin = true;
                str = "No";
              }
            }        
        }     	
      	
      	System.out.println(str);
        
	}
}

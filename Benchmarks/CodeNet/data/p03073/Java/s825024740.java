import java.util.*;
import java.util.Vector;
import java.math.*; 
public class Main {
     Scanner sc = new Scanner(System.in);
	//	System.out.println( );
	
	
	
	void run(){ // kokonikaku
		
		String s=sc.next();
		
		int l=s.length();
		
		int ans1=0,ans2=0;
		
		for(int i=0;i<l;i++){
			if(i%2==1){
				if(s.charAt(i)=='0') ans1++;
				else ans2++;
			}
			else{
				if(s.charAt(i)=='1') ans1++;
				else ans2++;
			}
		}
		
		System.out.println(Math.min(ans1,ans2));
	}

	
	public static void main(String[] args) {
		new Main().run();
        
    }
}
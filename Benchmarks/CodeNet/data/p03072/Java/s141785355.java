import java.util.*;
import java.util.Vector;
import java.math.*; 
public class Main {
     Scanner sc = new Scanner(System.in);
	//	System.out.println( );
	
	
	
	void run(){ // kokonikaku
		int[] a=new int[200];
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int ans=0;
		int ima=-1;
		for(int i=0;i<n;i++){
			if(ima<=a[i]){
				ans++;
			}
			ima=Math.max(ima,a[i]);
		}
		
		System.out.println(ans);
	}

	
	public static void main(String[] args) {
		new Main().run();
        
    }
}
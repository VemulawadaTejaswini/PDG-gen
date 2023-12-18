import java.util.*;

import java.math.*; 
public class Main {
     Scanner sc = new Scanner(System.in);
	
	
	void run(){ // kokonikaku
	 long n=sc.nextLong();
		
		 long a[] = new long[5];
		for(int i=0;i<5;i++){
			a[i]=sc.nextLong();
		}
		
		
		int it=-1;
		long mi=100000000000000000L;
		for(int i=0;i<5;i++){
			if(mi>a[i]){
				mi=a[i];
				it=i;
			}
		}
		
		long ans=n;
		
		ans/=mi;
		if(n%mi>0)ans++;
		ans--;
		
			System.out.println(ans+5);
		
		
		
    
	}

	
	public static void main(String[] args) {
		new Main().run();
        
    }
}
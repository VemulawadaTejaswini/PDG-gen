import java.util.*;
import java.util.Scanner;

public class Main{
	static Scanner sc=new Scanner(System.in);
	static int x=sc.nextInt();
	static int[] a=new int[x+1];
	
	public static void main(String[] args) {
	    a[1]=1;
	    for(int i=2;i<=x;i++) {
	    	a[i]=1;
	    }
	   int ans=0;
	   /* if(x>=1)ans=1;
	    if(x>=2)ans=5;
		//int t=x;
		if(x<=2) {
			System.out.println(ans);
			System.exit(0);
		}*/
		
		for(int j=1;j<=x;j++) {
			for(int i=1;i<=x;){
				if(i%j==0) {
					ans+=i;
					//System.out.println(j+" "+i);
					if(j!=1)i+=j;
					else i++;
				} else i++;
				
			}
		}
	    System.out.println(ans);
	}
}

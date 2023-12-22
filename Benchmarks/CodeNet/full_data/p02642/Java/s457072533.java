import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a =new int[n];
	    
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.nextInt();
	    }
	    
	    Arrays.sort(a);
	    int[]b =new int[n]; 
	    for(int i=0;i<n;i++) {
	    	b[i]=a[i];
	    }
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<n;j++) {
	    		if(i!=j && a[j]%b[i]==0) {
	    			a[j]/=b[i];
	    		}
	    	}
	    }
	    int ans=0;
	    for(int i=0;i<n;i++) {
	    	//System.out.println(a[i]+" "+b[i]);
	    	if(a[i]==b[i])ans++;
	    }
		
		System.out.println(ans);
	}
}

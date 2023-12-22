import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a =new int[n];
	    
		int count=0;
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.nextInt();
	    	if(i!=0 && a[i-1]!=a[i])count++;
	    }
	    
	    Arrays.sort(a);
	   int[]b =new int[n]; 
	   
	    
	    for(int i=0;i<n;i++) {
	    	if(b[i]==-1)continue;
	    	for(int j=0;j<n;j++)  {
	    		if(b[j]==-1)continue;
	    		if(i!=j && a[j]%a[i]==0) {
	    			b[j]=-1;
	    		}
	    	}
	    }
	    int ans=0;
	    for(int i=0;i<n;i++) {
	    	if(b[i]==0)ans++;
	    }
		if(count==0)ans=0;
		System.out.println(ans);
	}
}

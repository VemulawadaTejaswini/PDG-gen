    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan=new Scanner(System.in);
    		int n=Integer.parseInt(scan.next());
    		int a[];int memo;
    		a= new int[n];
    		for (int i=0;i<n;++i) {
    			a[i]=Integer.parseInt(scan.next());
    		}
    		
    		int count=0;
    		for(int k=0;k<n;++k) {
    			memo=a[k];
    			count=0;
    			for(int i=0;i<n;++i) {
    				if(i==k) {continue;}
    				
    				for(int j=i+1;j<n;++j) {
    					if(j==k) {continue;}
    					if(a[i]==a[j]) {
    						++count;
    					}
    				}
    			}
    			System.out.println(count);
    		}
    		
    		
    }	
    }
// end 
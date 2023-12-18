    import java.util.*;
    class shashwat{
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) 
    	{ 
    		int n=in.nextInt();
    		int arr[]=new int[n];
    		for(int i=0;i<n;i++)
    			arr[i]=in.nextInt();
    		int l[]=new int[n];
    		int r[]=new  int[n];
    		for(int i=0;i<n;i++) {
    			if(i==0) {
    				l[0]=arr[0];
    				r[n-1]=arr[n-1];
    			}
    			else {
    				l[i]=l[i-1]+arr[i];
    				r[n-i-1]=r[n-i]+arr[n-i-1];
    			}
    		}
    		//display(l);
    		//display(r);
    		int min=Integer.MAX_VALUE;
    		for(int i=0;i<n-1;i++) {
    			min=Math.min(min,Math.abs(l[i]-r[i+1]));
    		}
    			System.out.println(min);
    		
    		
    		
    		
    	}
     
    }
import java.util.*;
public class Main {

		
	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        boolean [] prime = new boolean[1299710];
	        for(int i=2;i<prime.length;i++)prime[i]=true;
	        for(int i=2;i<=Math.sqrt(prime.length-1);i++){
	        	if(prime[i]){
	        		for(int j=i*2;j<=prime.length-1;j+=i)prime[j]=false;
	        	}
	        }
	        
	        while(true){
	        	int k=scan.nextInt();
	        	if(k==0)break;
	        	if(prime[k])System.out.println(0);
	        	else{
	        		int lp=0;
	        		for(int i=k;i>1;i--)
	        			if(prime[i]){
	        				lp=i;
	        				break;
	        			}
	        		int rp=0;
	        		for(int i=k;i<1299710;i++)
	        			if(prime[i]){
	        				rp=i;
	        				break;
	        			}
	        		System.out.println(rp-lp);
	        	}
	        }
	    }
}
	    
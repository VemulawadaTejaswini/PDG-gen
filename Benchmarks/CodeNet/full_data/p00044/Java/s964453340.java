import java.util.*;
public class Main {

	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        boolean [] prime =new boolean[50022];
	        for(int i=2;i<prime.length;i++)prime[i]=true;
	        for(int i=2;i<=Math.sqrt(prime.length-1);i++){
	        	if(prime[i])
	        		for(int j=i*2;j<=prime.length-1;j+=i)prime[j]=false;
	        }
	        while(scan.hasNext()){
	        	
	        	int n=scan.nextInt();
	        	int prev =0;
	        	for(int i=0;i<50022;i++){
	        		if(prime[i]){
	        			if(i>n){
	        				System.out.println(prev+" "+i);
	        				break;
	        			}
	        			if(i!=n)
	        				prev = i;
	        		}
	        	}
	        	
	        }
	    }
}
	    
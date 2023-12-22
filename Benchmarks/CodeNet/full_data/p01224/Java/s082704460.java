import java.util.*;
public class Main {
	public static boolean [] prime = new boolean[100000001];
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        int k=100000000;
        for(int i=2;i<=Math.sqrt(k);i++){
        	if(!prime[i]){
        		for(int j=i*2;j<=k;j+=i)prime[j]=true;
        	}
        }
        prime[1]=true;
       
        while(true){
        	int n = scan.nextInt();
        	if(n==0)break;
        	if(prime[n]){
        	int s=fuctor_sum(n);
        	if(n==s)System.out.println("perfect number");
        	else if(n>s)System.out.println("deficient number");
        	else System.out.println("abundant number");
        	}
        	else System.out.println("deficient number");
        	
        }
    }
    public static int fuctor_sum(int n){
    	int sum=0;
     
    	for(int i=1;i<n;i++)
    		if(n%i ==0)sum+=i;
    	
    	return sum;
    }
}
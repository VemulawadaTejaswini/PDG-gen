import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            boolean [] prime = new boolean [10001];
            for(int i=3;i<=10000;i+=2)prime[i]=true;
            prime[2]=true;
            for(int i=3;i<=100;i++){
            	for(int j=i*i;j<=10000;j+=i*2)prime[j]=false;
            }
            
            while(scan.hasNext()){
            	
            	int n =scan.nextInt();
            	int ans=0;
            	
            	for(int i=2;i<n;i++){
            		if(prime[i]&&prime[n+1-i])ans++;
            	}
            	System.out.println(ans);
            }
        }
}
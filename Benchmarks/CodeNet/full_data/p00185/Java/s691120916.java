import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            boolean [] prime = new boolean[1000001];
             for(int i=3;i<=1000000;i+=2)prime[i]=true;
             prime[2]=true;
             int limit =(int)Math.sqrt(1000000);
             for(int i=3;i<=limit;i++){
                if(prime[i]){
                    for(int j=i*i;j<=1000000;j+=i*2)prime[j]=false;
                }
            }
             
            while(true){
                int k=scan.nextInt();
                if(k==0)break;
                int ans=0;
                for(int i=2;i<=k/2;i++){
                    if(prime[i]&&prime[k-i])ans++;
                 
                }
                
                System.out.println(ans);
            }
        }
}
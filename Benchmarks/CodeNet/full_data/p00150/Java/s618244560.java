import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n= scan.nextInt();
            if(n==0)break;
            boolean [] prime  = new boolean[n+1];
            for(int i=0;i<=n;i++)prime[i]=true;
             
            for(int i=2;i<n;i++)
                for(int j=i*2;j<n;j+=i)prime[j]=false;
            int max=0;
            for(int i=2;i<=n-2;i++)
                if(prime[i]&&prime[i+2])max =i+2;
            System.out.println(max-2+" "+max);
             
        }
       
 
  }
  }
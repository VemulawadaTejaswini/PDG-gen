import java.util.*;
class Main{
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      
        
             int n=scan.nextInt();
             long a[]=new long[n];
             for(int i=0;i<n;++i){
                 a[i]=scan.nextLong();
             }
             long mod=(long)1e9+7;
             long sum=0;
             long ans=0;
             for(int i=0;i<n-1;++i){
                 ans=0;
                 for(int j=i+1;j<n;++j){
                   ans=(ans%mod+(a[i]%mod*a[j]%mod)%mod)%mod;
                 
                 }
                 sum=(sum%mod+ans%mod)%mod;
             }
             System.out.println(sum);

         
    }
}
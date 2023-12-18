import java.util.*;

public class Main {
    public static int gcd(int a,int b){
        if(a<b) return gcd(b,a);
        if(a%b==0) return b;
        else return gcd(b,a%b);
    }
    
    public static int gcd(int a,int b,int c){
        return gcd(gcd(a,b),c);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        
        int ans=0;
        
        for(int i=1;i<=K;i++){
            for(int j=1;j<=K;j++){
                for(int k=1;k<=K;k++){
                    ans+=gcd(i,j,k);
                }
            }
        }
        
        System.out.println(ans);
    }
}

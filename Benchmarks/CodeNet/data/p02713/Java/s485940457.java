import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    
    public static int gcd(int a,int b){
        int r=0;
        while(b>0){
            r=a%b;
            b=a;
            r=a;
        }
        return a;
    }
    
    public static void main(String[] args){
        int k = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                for(int l=0;l<=k;l++){
                    ans += gcd(gcd(i,j),l);
                }
            }
        }
        System.out.println(ans);
    }
} 

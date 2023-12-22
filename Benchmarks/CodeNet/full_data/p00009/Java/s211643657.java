import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] N=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!N[i]){
                for(int j=i+i;j<=n;j+=i){
                    N[j]=true;
                }
            }
        }
        int ans=0;
        for(int i=2;i<=n;i++){
            if(!N[i])ans++;
        }
        System.out.println(ans);
    }
}
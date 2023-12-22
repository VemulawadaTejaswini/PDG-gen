import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            int s=sc.nextInt();
            if(n==0&&s==0) break;
            for(int i=0;i<=9;i++) dfs(0,0,i,n,s);
            System.out.println(ans);
            ans=0;
        }
        
    }
    static int ans;
    public static void dfs(int c,int sum,int now,int n,int s){
        sum+=now;
        c++;
        if(c==n){
            if(sum==s){
                ans++;
            }
            return;
        }
        for(int i=now+1;i<=9;i++) dfs(c,sum,i,n,s);
        return;
    }
}

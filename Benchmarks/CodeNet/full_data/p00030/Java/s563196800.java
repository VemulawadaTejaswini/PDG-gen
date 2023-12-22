import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int ans,n,x;
        while(true){
        n = s.nextInt();
        x = s.nextInt();
        if(n==0&&x==0)break;
        ans = solve(0,0,0,n,x);
        System.out.println(ans);

        

        }
    }
    public static int solve(int nn,int c,int now,int a,int b){
        int sum=0;
        if(nn==10&&now==b&&c==a)return 1;
        if(nn==10)return 0;
        sum += solve(nn+1,c,now,a,b);
        sum += solve(nn+1,c+1,now+nn,a,b);
        return sum;
    }
}

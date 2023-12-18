
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int sum[][] = new int[2*k+1][2*k+1];
        int t[][] = new int[2*k][2*k];
        for(int i=0;i<n;i++){
            int x = sc.nextInt(), y = sc.nextInt();
            String c = sc.next();
            x %= 2*k;
            y %= 2*k;
            if(x>=k&&y>=k){
                x-=k;
                y-=k;
            }
            if(c.equals("B")){
                if(x>y) x = (x + k) % k;
                else y = (y + k) % k;
            }
            if(y>x){
                int tmp = x;
                x = y;
                y = tmp;
            }
            t[x][y]++;
        }

        
        for(int i=0;i<2*k;i++){
            for(int j=0;j<k;j++){
                sum[i+1][j+1] = sum[i+1][j] + sum[i][j+1] -sum[i][j] + t[i][j];
            }
        }

        int ans = 0;
        for(int i=0;i<=k;i++){
            int t_ans = sum[k+i][k] - sum[i][k];
            ans = Math.max(ans , t_ans); 
        }
        System.out.println(ans);
    }
}
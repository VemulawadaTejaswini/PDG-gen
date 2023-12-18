import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //ArrayList<Integer> list = new ArrayList<Integer>();
        int dp[] = new int[3];
        
        for(int i=0;i<N;i++){
          if (i==0){
            dp[0] = sc.nextInt();
            dp[1] = sc.nextInt();
            dp[2] = sc.nextInt();
          }
          else{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int yesta = dp[0];
            int yestb = dp[1];
            int yestc = dp[2];
            dp[0] = Math.max(yestb+a,yestc+a);
            dp[1] = Math.max(yesta+b,yestc+b);
            dp[2] = Math.max(yesta+c,yestb+c);
          }
         
        }
        System.out.println(Math.max(Math.max(dp[0],dp[1]),dp[2]));
    }
}
import java.util.*;

class Main{
    public static void main(String[] args) {       
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        double ans = 0;
        for(int i = 1; i <= n ; i++){
            double p = 1;
            int x = i;
            while(x < k){
                p /= 2;
                x *= 2;
            }
            ans += p/n;
        }
        System.out.println(ans);
   }
}

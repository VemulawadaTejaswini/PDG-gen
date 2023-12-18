import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int k = scanner.nextInt();
        double ans = 0.0;
        for(int i = 1; i <= n; i++){
            int p = 0;
            double cur = i;
            while(cur < k){
                cur *= 2;
                p++;
            }
            ans += Math.pow(0.5, p) * 1 / n;
        }
        System.out.println(ans);
    }
}


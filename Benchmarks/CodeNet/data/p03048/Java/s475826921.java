import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;

        i:for(int i = 0; i <= n / r; i++){
            j:for(int j = 0; j <= n / g; j++){
                if(r * i + g * j > n){
                    continue i;
                }
                for(int k = 0; k <= n / b; k++){
                    int sum = r * i + g * j + b * k;
                    if(sum > n){
                        continue j;
                    }
                    if(sum == n){
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);

    }
}

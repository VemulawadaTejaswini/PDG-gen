import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = k;
        if(n >= 2){
            for(int i = 2; i <= n; i++){
                ans *= k - 1;
            }
        }
        System.out.println(ans);
    }
}
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];

        for(int i = 1;i <= n;i++){
            a[i]  = sc.nextInt();
        }

        int[] ans = new int[n+1];
        for(int i = n;i > 0;i--){
            if(i * 2 > n){
                ans[i] = a[i];
            } else {
                int sum = 0;
                for(int j = 2;i*j <= n;j++){
                    sum += ans[i*j];
                }
                if(sum % 2 == a[i]){
                    ans[i] = 0;
                } else {
                    ans[i] = 1;
                }
            }
        }
        for(int i = 1;i <= n;i++){
            System.out.println(ans[i]);
        }
    }
}


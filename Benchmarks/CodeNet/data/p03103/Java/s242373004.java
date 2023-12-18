import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextInt();
        sc.nextLine();

        long a[][] = new long[2][n];

        long min = Long.MAX_VALUE;
        int num = 0;
        for(int i = 0;i<n;i++){
            a[0][i] = sc.nextLong();
            a[1][i] = sc.nextLong();
            sc.nextLine();
            if(min >= a[0][i]){
                min = a[0][i];
                num = i;
            }
        }
        int count = 0;
        long ans = 0;
        long min2 = Long.MAX_VALUE;
        while(count < m){            
            if(a[1][num] < m-count){
                ans += a[1][num] * min;
                count += a[1][num];
            }else{
                ans += (m-count) * min;
                count += m-count;
            }

            for(int i = 0;i<n;i++){
                if(min < a[0][i] && min2 >= a[0][i]){
                    min2 = a[0][i];
                    num = i;
                }
            }
            min = min2;
            min2 = Long.MAX_VALUE;
        }
        System.out.println(ans);
    }
}
import java.util.Scanner;
public class Main{
    public static int check(long dp[], long a){
        int start = 0;
        int end = dp.length-1;
        while(true){
            if(dp[start] >= a)
                return start;
            else if(dp[end] <= a)
                return end;
            else{
                if(start+1 == end)
                    return end;
                else{
                    int mid = (start+end)/2;
                    if(dp[mid] == a)
                        return mid;
                    else if(dp[mid] > a)
                        end = mid;
                    else
                        start = mid;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i = 0 ; i < n ; i++)
            a[i] = sc.nextLong();
        long dp[] = new long[n];
        for(int i = 0 ; i < n ; i++){
            dp[i] = 1000000001;
        }
        dp[0] = a[0]; 
        for(int i = 1 ; i < n ; i++)
            dp[check(dp,a[i])] = a[i];
        for(int i = 0 ; i < n ; i++){
            if(dp[i] > 1000000000){
                System.out.println(i);
                break;
            }
            if(i == n-1)
                System.out.println(n);
        }
    }
}

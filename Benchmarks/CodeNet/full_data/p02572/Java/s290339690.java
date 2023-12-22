import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextLong();
        System.out.println(result(arr,n));
    }
    static long result(long arr[],int n){
        long res = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                res = (res + (((arr[i]% 1000000007)*(arr[j]% 1000000007)) % 1000000007))%1000000007;
            }
        }
        return (res % 1000000007);
    }
}
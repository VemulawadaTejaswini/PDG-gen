import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int[] sum1 = new int[n];
        int[] sum2 = new int[n];
        sum1[0] = a[0];
        sum2[0] = a[0];
        int count = 0;
        count = Math.min(solve1(sum1,a,count),solve2(sum2,a,count));
        System.out.println(count);
    }
    public static int solve1(int[] sum,int[] a,int count){
        if(sum[0] <= 0){
            count += 1 - sum[0];
            sum[0] = 1;
        }
        for(int i = 0;i < sum.length-1;i++){
            sum[i+1] = sum[i] + a[i+1];
            if((i+1) % 2 == 1){
                if(sum[i+1] >= 0){
                    count += 1 + sum[i+1];
                    sum[i+1] = -1;
                }
            }
            if((i+1) % 2 == 0){
                if(sum[i+1] <= 0){
                    count += 1 - sum[i+1];
                    sum[i+1] = 1;
                }
            }
        }
        return count;
    }
    public static int solve2(int[] sum,int[] a,int count){
        if(sum[0] >= 0){
            count += 1 + sum[0];
            sum[0] = -1;
        }
        for(int i = 0;i < sum.length-1;i++){
            sum[i+1] = sum[i] + a[i+1];
            if((i+1) % 2 == 1){
                if(sum[i+1] <= 0){
                    count += 1 - sum[i+1];
                    sum[i+1] = 1;
                }
            }
            if((i+1) % 2 == 0){
                if(sum[i+1] >= 0){
                    count += 1 + sum[i+1];
                    sum[i+1] = -1;
                }
            }
        }
        return count;
    }
}

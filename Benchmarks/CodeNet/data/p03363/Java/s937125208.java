import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[n+1];
        for(int i = 1; i < n+1; i++){
            sum[i] = sum[i-1] + sc.nextInt();
        }
        Arrays.sort(sum);
        long ans = 0;
        int tmp = -1, prev = sum[0];
        for(int i = 0; i < sum.length; i++){
            if(sum[i] == prev) tmp++;
            else{
                tmp = 0;
                prev = sum[i];
            }
            ans += tmp;
        }
        System.out.println(ans);
    }
}



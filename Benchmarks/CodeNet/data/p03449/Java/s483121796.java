import java.util.*;
class Main
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[2][n];
        for(int i=0; i<n; i++){
            a[0][i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            a[1][i] = sc.nextInt();
        }

        int sum = 0;
        int max = 0;
        int key = 0;

        for(int i=0; i<n; i++){
            sum += (a[0][i] - a[1][i]);
            if(sum > max){
                sum = max;
                key = i;
            }
        }
        int ans = 0;
        for(int i=0; i<=key; i++){
            ans += a[0][i];
        }
        for(int i=key; i<n; i++){
            ans += a[1][i];
        }
        System.out.println(ans);
    }
}
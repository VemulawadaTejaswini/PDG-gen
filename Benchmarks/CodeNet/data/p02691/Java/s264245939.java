import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n + 1];
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n + 1; i++){
            a[i] = sc.nextInt();
            min = Math.min(min, a[i]);
        }
        long ans = 0;
        for(int i = min * 2; i < n; i++){
            for(int j = i + 1; j < n + 1; j++){
                int s = Math.abs(i - j);
                if(a[i] + a[j] == s){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

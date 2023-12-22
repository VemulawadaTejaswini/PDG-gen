import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    int findMax(int n){
        int max = Integer.MIN_VALUE;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += a[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    void solve(){
        int n = in.nextInt();
        while(n != 0){
            System.out.println(findMax(n));
            n = in.nextInt();
        }
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}
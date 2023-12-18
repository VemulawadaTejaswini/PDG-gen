import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lim = sc.nextInt();
        int[] hum = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(sc.nextInt() >= lim){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
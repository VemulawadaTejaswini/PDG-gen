import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] lst = new int[n];
        long ans = 0;
        for(int i = 0; i < n; i++) {
            lst[i] = scan.nextInt();
        }
        for(int i = 0; i < n - 1; i++) {
            if(lst[i] + lst[i + 1] > x){
                ans += lst[i] + lst[i + 1] - x;
                lst[i + 1] = Math.max(0, x - lst[i]);
            }
        }
        System.out.println(ans);
    }
}
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0;i < n;i++){
            h[i] = sc.nextInt();
        }
        
        int cnt = 1;
        int max = h[0];
        for(int i = 1;i < n;i++){
            if (max <= h[i]) {
                cnt++;
                max = h[i];
            }
        }
        System.out.println(cnt);
    }
}
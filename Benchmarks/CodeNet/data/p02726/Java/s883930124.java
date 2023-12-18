import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int[] cnt = new int[n];
        for(int i = 1; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                int dist = j - i;
                if(j <= x || i >= y){
                    cnt[dist]++;
                } else {
                    int dist2 = Math.abs(x - i) + Math.abs(y - j) + 1;
                    cnt[Math.min(dist, dist2)]++;
                }
            }
        }
        for(int i = 1; i < n; i++){
            System.out.println(cnt[i]);
        }
    }
}
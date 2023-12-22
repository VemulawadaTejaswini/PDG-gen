import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sunuke = new int[n];
        int ans = 0;

        for(int i = 0;i < k;i++){
            int d = sc.nextInt();
            for(int j = 0;j < d;j++){
                int num = sc.nextInt();
                sunuke[num-1]++;
            }
        }

        for(int i = 0;i < n;i++){
            if(sunuke[i] == 0)
                ans++;
        }
        System.out.println(ans);
    }
}
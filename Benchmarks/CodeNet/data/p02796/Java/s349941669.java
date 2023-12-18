import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] range = new int[n][2];
        for(int i = 0;i < n;i++) {
            int x = sc.nextInt();
            int l = sc.nextInt();
            range[i][0] = x - l;
            range[i][1] = x + l;
        }

        Arrays.sort(range, (l, r) -> Integer.compare(l[0], r[0]));
        
        boolean[] canRemove = new boolean[n];
        for(int i = 0;i < n - 1;i++) {
            if(canRemove[i]) continue;
            int r = range[i][1];
            for(int j = i + 1;j < n;j++) {
                int l = range[j][0];
                if(l <= r) {
                    if((j == n - 1) && range[j][1] <= r) canRemove[j] = true; 
                    for(int k = i + 1;k < j - i;k++) canRemove[k] = true;
                }
            }
        }

        int count = n;
        for(int i = 0;i < n;i++) if(canRemove[i]) count--;
        System.out.println(count);
    }
}

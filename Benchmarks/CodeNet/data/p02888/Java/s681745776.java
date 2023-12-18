import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ll = new int[n];
        for(int i = 0; i < n; i++){
            ll[i] = sc.nextInt();
        }
        Arrays.sort(ll);
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int tmp = Arrays.binarySearch(ll,ll[i] + ll[j]);
                tmp = tmp >= 0 ? tmp-1 : ~tmp;
                ans += Math.max(0,tmp-j-1);
            }
        }
        System.out.println(ans);
    }
}

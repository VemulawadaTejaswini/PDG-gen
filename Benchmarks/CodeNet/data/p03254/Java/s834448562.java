import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(x > a[i]){
                if(i != n-1){
                    ans++;
                    x -= a[i];
                }
            }else if(x == a[i]){
                ans++;
                break;
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
}

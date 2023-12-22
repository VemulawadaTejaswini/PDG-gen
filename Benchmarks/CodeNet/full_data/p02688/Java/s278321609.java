import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] treat = new int[n];
        for(int i = 0; i < k; i++){
            int n2 = sc.nextInt();
            for(int j = 0; j < n2; j++){
                treat[sc.nextInt()-1]++;
            }
        }
        int ans = 0;
        for(int t : treat){
            if(t == 0) ans++;
        }
        System.out.println(ans);
    }
}

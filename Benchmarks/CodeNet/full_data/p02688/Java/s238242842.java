import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] count = new int[n];
        
        for(int i = 0; i < k; i++){
            int d = Integer.parseInt(sc.next());
            int[] a = new int[d];
            for(int j = 0; j < d; j++){
                a[i] = Integer.parseInt(sc.next());
                count[a[i]]++;
            }
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            if(count[i] == 0)
                ans++;
        }

        System.out.println(ans);
    }
}
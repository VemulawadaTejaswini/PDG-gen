import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] al = new int[n];
        for(int i = 0; i < n; i++){
            al[i] = sc.nextInt()-1;
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(al[al[i]] == i) ans++;
        }
        System.out.println(ans/2);
    }
}

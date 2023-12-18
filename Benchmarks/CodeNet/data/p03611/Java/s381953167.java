import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] al = new int[100002];
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a != 0){
                al[a-1]++;
            }
            al[a]++;
            al[a+1]++;
        }
        int ans = 0;
        for(int a : al){
            ans = Math.max(ans, a);
        }
        System.out.println(ans);
    }
}
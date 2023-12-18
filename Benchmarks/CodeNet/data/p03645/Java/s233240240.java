import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p1 = new int[n];
        int[] pn = new int[n];
        for(int i = 0; i < k; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            if(a1 == 1){
                p1[a2-1]++;
            }else if(a2 == n){
                pn[a1-1]++;
            }
        }
        for(int i = 1; i < n-1; i++){
            if(p1[i] + pn[i] == 2){
                System.out.println("POSSIBLE");
                return;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
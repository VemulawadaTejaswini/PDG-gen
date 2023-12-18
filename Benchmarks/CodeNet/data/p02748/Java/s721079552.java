import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int[] al = new int[a];
        int[] bl = new int[b];
        int amin = Integer.MAX_VALUE;
        int bmin = Integer.MAX_VALUE;
        for(int i = 0; i < a; i++){
            al[i] = sc.nextInt();
            amin = Math.min(amin,al[i]);
        }
        for(int i = 0; i < b; i++){
            bl[i] = sc.nextInt();
            bmin = Math.min(bmin,bl[i]);
        }
        int ans = amin + bmin;
        for(int i = 0; i < m; i++){
            int ax = sc.nextInt()-1;
            int bx = sc.nextInt()-1;
            int c = sc.nextInt();
            ans = Math.min(ans,al[ax]+bl[bx]-c);
        }
        System.out.println(ans);
    }
}

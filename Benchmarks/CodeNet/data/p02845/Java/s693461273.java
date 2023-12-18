import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long ans = 1L;
        int[] b = new int[3];
        for (int x : a) {
            long cnt = 0L;
            for(int y : b){
                if(x == y) cnt++;
            }
            ans = ans * cnt % 1000000007L;
            for (int i = 0; i < 3; i++) {
                if(b[i] == x){
                    b[i]++;
                    break;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}

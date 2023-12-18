import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double half = (double)a[n-1]/2d;
        int ans2 = a[0];
        for(int i = 1; i < n-1; i++){
            if(Math.abs(ans2-half) > Math.abs(a[i]-half)){
                ans2 = a[i];
            }
        }
        System.out.println(a[n-1] + " " + ans2);
    }
}
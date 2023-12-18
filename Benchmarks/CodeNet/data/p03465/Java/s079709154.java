import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(a);

        boolean[] u = new boolean[n];
        long sa = 0;
        long sb = 0;

        for(int i=0; i<n; i++){
            if(sa <= sb){
                sa += a[n-i-1];
                u[n-i-1] = true;
            }else{
                sb += a[n-i-1];
                u[n-i-1] = false;
            }
        }

        
        System.out.println(Long.max(sa, sb));
    }
}
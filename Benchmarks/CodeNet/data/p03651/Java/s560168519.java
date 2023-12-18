import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        long[] a = new long[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }

        int j = 0;

        for(int i = 0; i<n; i++){
            j = i+1;
            while(j<n){
                if(Math.abs(a[i]-a[j])==k){
                    System.out.println("POSSIBLE");
                    System.exit(0);
                }
                j++;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
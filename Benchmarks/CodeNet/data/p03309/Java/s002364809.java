import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[n];
        long ans = 0;
        for (int i=0;i<n;i++){
            A[i]=sc.nextInt()-i-1;
        }
        Arrays.sort(A);
        if (n%2==0){
            for (int i=0;i<n;i++) ans += Math.abs(A[i]-(A[n/2-1]+A[n/2])/2);
        }else {
            for (int i=0;i<n;i++) ans += Math.abs(A[i]-(A[(n-1)/2]));
        }
        System.out.println(ans);
    }

}

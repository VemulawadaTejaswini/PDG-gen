import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        int ans = A[0];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(A[j] % A[i] != 0){
                    ans = Math.min(ans, A[j] % A[i]);
                }
                if(ans == 1) break;
                else if(A[j] % ans != 0) ans = Math.min(ans, A[j] % ans);
            }
            if(ans == 1) break;
        }

        System.out.println(ans);
        sc.close();


    }

}

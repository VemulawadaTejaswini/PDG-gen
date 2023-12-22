import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();


        List<Long> A = new ArrayList<>();
        List<Long> B = new ArrayList<>();

        A.add(0L);
        B.add(0L);

        long sumA_i = 0;
        for (int i = 0; i < n; i++) {
            long A_i = sc.nextLong();
            sumA_i += A_i;
            A.add(sumA_i);
        }


        long sumB_i = 0;
        for (int i = 0; i < m; i++) {
            long B_i = sc.nextLong();
            sumB_i += B_i;
            B.add(sumB_i);
        }

        int j = m,ans = 0;
        for(int i = 0; i <= n; i++){
            if(A.get(i) > k){
                break;
            }

            while (B.get(j) > k - A.get(i)){
                j--;
            }
            
            ans = Math.max(ans,i + j);
        }

        System.out.println(ans);


    }
}

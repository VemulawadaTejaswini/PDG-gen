import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for(int j=0; j<N; j++) {
            A[j] = sc.nextInt();
        }
        sc.close();

        int ans = 0;
        int max = A[0];
        for(int i=1; i<A.length; i++){
            if(max-A[i]>=0){
                ans += max-A[i];
            }else{
                max = A[i];
            }
        }
        System.out.println(ans);
    }
}

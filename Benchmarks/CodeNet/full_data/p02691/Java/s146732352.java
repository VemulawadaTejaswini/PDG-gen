import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int maxA = 1000000000;
        Long ans = 0l;

        for(int i=0;i<N;i++){
            A[i+1] = sc.nextInt();
            maxA = Math.max(A[i+1],maxA);
        }

        for(int i=1;i<N;i++){
            for(int j = A[i] + i;j<=N;j++){
                if(A[j] == j-i - A[i]){
                    ans++;
                }
                if(j > maxA){
                    j=N+1;
                }
            }
        }
        System.out.println(ans);
    }

}








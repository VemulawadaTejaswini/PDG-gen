import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> p = new HashSet<>();

        int N = sc.nextInt();
        int[] A = new int[N];
        boolean[] devided = new boolean[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        for(int i=0;i<N-1;i++){
            if(!devided[i]){
                for(int j = i+1;j<N;j++){
                    if(A[j] % A[i] == 0){
                        devided[j] = true;
                    }
                }
            }
        }
        int ans =0;

        if(A[0] == A[N-1]){
            System.out.println(0);
        } else {
            for(int i =0;i<N;i++){
                if(!devided[i]){
                    ans++;
                }
            }
            System.out.println(ans);
        }

    }

}

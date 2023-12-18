import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 1;i<N;i++){
            A[i] = sc.nextInt();
        }
        for(int i=1;i<N+1;i++){
            int ans = 0;
            for(int j=1;j<N;j++){
                if(A[j]==i){
                    ans++;
                }
            }
            System.out.println(ans);
        }

    }
}
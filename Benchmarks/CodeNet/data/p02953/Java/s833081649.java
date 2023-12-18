import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++){
            H[i] = sc.nextInt();
        }

        for(int i = N-1; i > 0; i--){
            if(max(N-1, H) - H[i] >= 2){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }        

    static int max(int n, int[] a){
        int max = a[0];
        for(int i = 0; i < n-1; i++){
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }
    
}

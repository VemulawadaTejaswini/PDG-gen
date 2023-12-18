import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        int[] A = new int[N];
        int even = 0;
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            if(A[i] % 2 == 0)
                even++;
        }
        sc.close();
        System.out.println((int)Math.pow(3, N) - (int)Math.pow(2, even));
    }
}
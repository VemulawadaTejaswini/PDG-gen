import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(A);
        long h = 0;
        long w = 0;

        int count = 0;

        int idx = N-1;
        while(idx > 0){
            if(A[idx] == A[idx-1]){
                if(count == 1){
                    w = A[idx];
                    count++;
                }
                if(count == 0){
                    h = A[idx];
                    count++;
                } 
                idx--;
            }
            idx--;
        }
        System.out.println(h*w);
    }
}
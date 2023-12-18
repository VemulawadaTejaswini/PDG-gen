import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        
        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0 ; i < N ; i++){
            B[i] = sc.nextInt();
        }
        for(int i = 0 ; i < N ; i++){
            C[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(A);
        Arrays.sort(C);
        
        int countA = 0;
        int countC = 0;
        int ans = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(B[i] - A[j] > 0){
                    countA++;
                }
                if(C[N-1-j] - B[i] > 0){
                    countC++;
                }
                if(B[i] <= A[j] && C[N-1-j] <= B[i]){
                    break;
                }
            }
        ans += countA * countC;
        countA = 0;
        countC = 0;
        }
        
        System.out.println(ans);
    }
}
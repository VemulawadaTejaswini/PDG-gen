import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Double A[] = new Double[N + 1];
        double ans = 0;
        A[0] = sc.nextDouble();
        if(A[0] != 0){
                ans = -1;
            }
        for(int i = 1; i < N + 1;i++){
            A[i] = sc.nextDouble();
            if(A[i - 1] > A[i] + 2||A[i - 1] < A[i] - 2){
                ans = -1;
            }
            
        }
        
        if(ans != -1){
            ans = ans + A[N];
            for(int i = N - 1; i > -1 ;i--){
                ans = Math.ceil(ans + (A[i + 1])/2 + A[i]);
            }
        }
        
        System.out.println((int)ans);
    }
}
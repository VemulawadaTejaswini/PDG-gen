import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int ans = 1;
        int max = -1;
        int dif = 0;
        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                if(A[i] < A[j]){
                     dif = A[j] - A[i];
                     if(dif > max){
                         max = dif;
                     } else if(dif == max){
                         ans++;
                     }
                }
            }
        }
        System.out.println(ans);
    }
}

import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] A = new long[N+1];
        long max = 0;
        for(int i = 1; i <= N; i++) {
            A[i] = Long.parseLong(sc.next());
            if(max < A[i]) {
                max = A[i];
            }
        }
        
        long ans = 0;
        for(int i = 1; i <= N-1; i++) {
            if(A[i] > N-i-1) {
                continue;
            }
            for(int j = i+(int)A[i]+1; j <= N; j++) {
                if(j - i == A[j]+A[i]) {
                    ans++;
                }
                if(j - i > max+A[i]) {
                    break;
                }
            }
            
        }
        System.out.println(ans);
    }
}
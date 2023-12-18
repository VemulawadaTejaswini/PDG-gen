import java.util.*;

public class Main {
    
    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final ArrayList<Integer> C = new ArrayList<>();
        final int mod = 1000000007;
        int[] two = new int[N+1];
        two[0] = 1;
        for(int i=0; i<N; i++){
            two[i+1] = (two[i]*2) % mod;
        }
        for(int i=0; i<N; i++){
            C.add(scanner.nextInt());
        }
        Collections.sort(C);
        int ans = 0;
        for(int i=0; i<N; i++){
            long sum = N-i-1;
            if(N-2 !=0){
                sum = (two[N-2] * sum) % mod;
            }else{
                sum = 0;
            }
            sum = (two[N-1] + sum) % mod; 
            sum = (C.get(i) * sum) % mod;
            ans = (int)((ans + sum) % mod);
        }
        ans = (int)((long)ans * (long)two[N]) % mod;
        System.out.println(ans);
    }
}
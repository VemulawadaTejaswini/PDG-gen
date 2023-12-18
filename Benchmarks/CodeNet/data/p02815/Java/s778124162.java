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
        long ans = 0;
        for(int i=0; i<N; i++){
            long sum;
            if(N-i-1 !=0){
                sum = (two[N-i-2] * (N-i-1)) % mod;
            }else{
                sum = 0;
            }
            sum = (two[N-i-1] + sum) % mod; 
            sum = (two[i] * sum) % mod; 
            sum = (C.get(i) * sum) % mod;
            ans = (ans + sum) % mod;
        }
        ans = (ans * two[N]) % mod;
        System.out.println(ans);
    }
}
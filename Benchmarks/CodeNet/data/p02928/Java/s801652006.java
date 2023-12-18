import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            
            long BIG = 10;
            for(int i = 0;i<8;i++){
                BIG*=10;
            }
            BIG+=7;
            
        
            int N = sc.nextInt();
            long K = sc.nextLong();
            
            int[] arr = new int[N];
            
            for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(sc.next());
            }
            
            long count1 = 0;
            long count2 = 0;
            
            // 次以降
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(arr[i] > arr[j]){
                        count1++;
                        count1 %= BIG;
                    }
                }   
            }
            count1 %= BIG;
            long result = add(K) % BIG;
            count1 *= result;
            
            // 自分のなか
            for(int i = 0; i < N-1; i++){
                for(int j = i+1; j < N; j++){
                    if(arr[i] > arr[j]){
                        count2++;
                    }
                }   
            }
            count2 %= BIG;
            K %= BIG;
            count2*=K;
            System.out.println((count1+count2)%BIG);
    }
    
    static long add(long K){
        long sum = 0;
        for(int i = 1; i < K; i++){
            sum += i;
        }
        return sum;
}
}

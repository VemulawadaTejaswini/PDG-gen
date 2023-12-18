import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stdR1 = br.readLine().split(" ");
        int N = Integer.parseInt(stdR1[0]);
        int M = Integer.parseInt(stdR1[1]);
        
        String[] stdR2 = br.readLine().split(" ");
        PowerfulDiscountTickets pdt = new PowerfulDiscountTickets(N, M);
        
        for(int i = 0; i < N; i++){
            pdt.goods[i] = Integer.parseInt(stdR2[i]);
        }
        
        System.out.println(pdt.binarySearch());
    }
}

class PowerfulDiscountTickets{
    int N;
    int M;
    int[] goods;
    
    public PowerfulDiscountTickets(int N, int M){
        this.N = N;
        this.M = M;
        goods = new int[N];
    }
    
    public long binarySearch(){
        long left = -1;
        long right = 100_000_000_000_000L;
        
        while(right - left > 1){
            long mid = (left + right) / 2;
            if(isOK(mid)){
                right = mid;
            }else{
                left = mid;
            }
        }
        
        return right;
    }
    
    private boolean isOK(long price){
        
        int[] goods2 = goods.clone();
        Arrays.sort(goods2);
        
        long sum = 0;
        for(int i = 0; i < N; i++){
            sum += goods2[i];
        }
        
        for(int i = 0; i < M; i++){
            int before = goods2[N-1];
            goods2[N-1] /= 2;
            sum = sum - before + goods2[N-1];
            if( sum <= price ) break;
            Arrays.sort(goods2);
        }
        
        return sum <= price;
    }
    

}



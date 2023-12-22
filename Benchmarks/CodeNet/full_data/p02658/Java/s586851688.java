import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] n = new long[N];
        
        n[0] = sc.nextLong();
        
        for(int i=1; i<N; i++){
            n[i] = sc.nextLong();
            n[0] *= n[i];
        }
        
        if(n[0] > 1000000000000000000L){
            System.out.println("-1");
        }else{
            System.out.println(n[0]);
        }
    }
}
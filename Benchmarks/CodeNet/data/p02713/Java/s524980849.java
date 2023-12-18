import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int k = Integer.parseInt(sc.next());
        
        long ans = 0;
        for(int i = 1; i <= k; i++){
            for(int j = 1; j <= k; j++){
                long a = gcd(i, j);
                for(int l = 1; l <= k; l++){
                    ans += gcd(a, l);
                }
            }
        }
        System.out.println(ans);
    }
    
    static long gcd(long a, long b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}
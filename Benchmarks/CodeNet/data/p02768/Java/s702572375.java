import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        int j;
        long res = 0;
        
        for(int i=1; i<=N; i++){
            if(i == a || i == b){
            } else {
                res = res + combination(N,i);
            }
        }

        res = res%((int) Math.pow(10,9)+7);
        System.out.println(res);   

        
    }

    public static int combination(int n, int k){
        if(k == 1){
            return n;
        } else if(n == k){
            return 1;
        } else {
            int res = combination(n-1,k-1) + combination(n-1,k);
            return res;
        }
    }
    
}

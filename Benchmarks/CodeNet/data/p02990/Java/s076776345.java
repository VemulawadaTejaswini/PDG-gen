import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        int N = stdIn.nextInt();
        int K = stdIn.nextInt();

        for(int i=1; i<=K; i++){
            if(N-K < i-1){
                System.out.println(0);
            }else{
                System.out.println(combination(K-1, i-1) * combination(N-K+1, i) % 1000000007);
            }
        }
    }

    static long combination(int n, int r){
        long num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}
import java.util.Scanner;

class Main{
    static int MAX_N = 1000000;
    static boolean isprime[] = new boolean[MAX_N];

    public static void eratosthenes(){
        for(int i = 0; i < MAX_N; i++){
            isprime[i] = true;
        }
        isprime[0] = isprime[1] = false;
        for(int x = 0; x * x < MAX_N; x++){
            if(isprime[x]){
                for(int y = x * x; y < MAX_N; y += x){
                    isprime[y] = false;
                }
            }
        }
    }

    public static void main(String[] args){
        eratosthenes();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), ans = 0;
        for(int i = 0; i <= n; i++){
            if(isprime[i]){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
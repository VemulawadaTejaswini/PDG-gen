import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static boolean[] prime = new boolean[1000001];
    static int n;
    public static void main(String[] args) {
        makePrime();
        while(read()){
            solve();
        }

    }

    static void makePrime(){
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i < prime.length; i++){
            if(prime[i]){
                for(int j = i*2; j < prime.length; j += i)prime[j] = false;
            }
        }
    }

    static boolean read(){
        n = sc.nextInt();
        if( n == 0 )return false;
        return true;
    }

    static void solve(){
        int res = 0;
        for(int i = 2; i <= n/2; i++){
            if(prime[n - i] && prime[i])res++;
        }
        System.out.println(res);
    }

}
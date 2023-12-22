import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    static int mod = 1000000007;

    static int power(int m , int n){
        if(n == 1){
            return m % mod;
        }else if(n % 2 == 0){
            return (int)Math.pow(power(m, n/2), 2.0) % mod;
        }else{
            return (m * power(m, n-1)) % mod;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        System.out.println(power(m,n));
    }
}

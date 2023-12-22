import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0; i<n; i++){
            if(isPrime(Integer.parseInt(br.readLine()))) ans++;
        }
        System.out.println(ans);
    }
    private static boolean isPrime(int x){
        if(x<2) return false;
        if(x<=3) return true;
        if(x%2==0||x%3==0) return false;
        for(int i = 5; i*i<=x; i += 6){
            if(x%i==0||x%(i+2)==0) return false;
        }
        return true;
    }
}
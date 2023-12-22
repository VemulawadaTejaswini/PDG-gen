import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args)throws IOException{
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int x;
        for(int i = 0; i < n; i++){
            x = Integer.parseInt(br.readLine());
            if(isPrime(x)) count++;
        }
        System.out.println(count);
    }

    public static boolean isPrime(int x){
        if(x < 2) return false;
        else if(x == 2) return true;
        if(x % 2 == 0) return false;
        int i;
        for(i = 3; i * i <= x; i += 2){
            if(x % i == 0) return false;
        }
        return true;
    }

}
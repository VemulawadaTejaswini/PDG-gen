import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static long fib(int n){
            if (n==0){
                return 1;
            }else if(n==1){
                return 1;
            }else{
                return fib(n-1)+fib(n-2);
            }
        } 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fib(n));
    }
}
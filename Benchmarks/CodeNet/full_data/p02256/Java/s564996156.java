import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Split line to array
        String[] data = br.readLine().split(" ");
        
        long A = Long.parseLong(data[0]);
        long B = Long.parseLong(data[1]);
        
        
        System.out.println(gcd(A, B));
    }
    static long gcd(long a, long b){
       if(a < b){
           long temp = a;
           a = b;
           b = temp;
       }
       if(b >0){
           return gcd(b,a % b);
       }else{
           return a;
       }
    }
}
      


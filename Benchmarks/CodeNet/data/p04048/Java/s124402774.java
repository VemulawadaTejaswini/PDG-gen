import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] num = line.split(" ");
        long n = Integer.parseInt(num[0]);
        long x = Integer.parseInt(num[1]);
        long result = n; //真横にx、反射してn-xまでは確定なので、合計値のnを初期値とする。
        long divisor;
        long divided;
        if(n-x > x){
            divided = n-x;
            divisor = x;
        } else {
            divided = x;
            divisor = n-x;
        }
        long a;
        while(true){
            result = result + 2 * divisor * (divided / divisor);
            if(divided % divisor == 0){
                result = result - divisor;
                break;
            }
            a = divided;
            divided = divisor;
            divisor = a % divisor;
        }
        System.out.println(result);
    }
}

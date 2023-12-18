import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        System.out.println(getSum(n) ? "Yes" : "No");
    }

    public static boolean getSum(int n){
        int copyN = n;
        int sum = 0;
        while (n > 9){
            sum += n % 10;
            n /= 10;
        }
        if (n > 0)
            sum+= n;

        return copyN % sum == 0;
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        System.out.println(checkValue(n, 4, 7) || checkValue(n, 7, 4)? "Yes" : "No");
    }

    public static boolean checkValue(int n, int v1, int v2){
        return  (n % v1) % v2 == 0;
    }
}

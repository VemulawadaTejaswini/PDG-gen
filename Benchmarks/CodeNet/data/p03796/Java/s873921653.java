import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int power = 1;
        for(int i = 1;i <= N;i++){
            power *= i;
        }
        long mod = 1000000007;
        System.out.println(power % mod);
    }
}

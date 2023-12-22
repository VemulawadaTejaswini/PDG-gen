import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        int distance = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < point; i++){
            double p = sc.nextInt();
            double q = sc.nextInt();
        if (distance >= (Math.sqrt(p * p + q * q))) {
            ans++;
        }
    }
        System.out.println(ans);        
    }
}
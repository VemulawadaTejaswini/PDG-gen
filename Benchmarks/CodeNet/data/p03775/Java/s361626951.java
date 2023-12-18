import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int r = (int) Math.ceil(Math.sqrt(n));
        long tmp = n;
        long a = 1;
        long b = 1;
        for (int i = 2; i < r; i++) {
            while(tmp % i == 0){
                tmp /= i;
                if(a > b) b *= i;
                else a *= i;
            }
        }
        int ans;
        if(tmp == n) ans = String.valueOf(n).length();
        else if(tmp >= r) ans = String.valueOf(tmp).length();
        else if(a > b) ans = String.valueOf(a).length();
        else ans = String.valueOf(b).length();

        System.out.println(ans);
        sc.close();
    }

}

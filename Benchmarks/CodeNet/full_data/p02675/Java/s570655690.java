import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] ans = {"pon","pon","hon","bon","hon","hon","pon","hon","pon","hon"};

        System.out.println(ans[N % 10]);


    }

}








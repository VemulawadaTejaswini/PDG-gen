import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        String ans = "";


        while(true){
            int mod = (int)N % 26;
            N = N / 26;
            ans = Character.toString('a' + Character.toChars(mod)[0] -1) + ans;

            if(N == 0)
                break;
        }

        System.out.println(ans);

    }

}

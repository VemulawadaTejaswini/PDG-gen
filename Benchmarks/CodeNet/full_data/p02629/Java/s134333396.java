import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String ans = "";
        String s = "zabcdefghijklmnopqrstuvwxy";
        char[] c = s.toCharArray();


        while(true){
            long mod = N % s.length();
            N = N / s.length();
            ans =  c[(int)mod] + ans;

            if(N == 0)
                break;
        }

        System.out.println(ans);

    }

}

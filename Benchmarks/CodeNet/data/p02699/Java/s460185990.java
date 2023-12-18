import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int S= sc.nextInt();
        int W =sc.nextInt();

        if(S <= W){
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }

    }

}








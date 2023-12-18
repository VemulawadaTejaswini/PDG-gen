import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String S  = sc.next();
        String T = sc.next();

        if(T.substring(0,T.length()-1).equals(S)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

}








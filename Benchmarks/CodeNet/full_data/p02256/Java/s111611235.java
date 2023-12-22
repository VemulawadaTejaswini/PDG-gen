import java.util.Scanner;

public class GreatestCommonDivisor {

    public int gcd(int a, int b)
    {
        if(a == 0 || b == 0) return a+b; // base case
        return gcd(b,a%b);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println(gcd(a,b));


    }
}


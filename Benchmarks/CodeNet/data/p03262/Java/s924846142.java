import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt() - x;
        }

        System.out.println(Math.abs(gcd(a)));

    }

    static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    static int gcd(int[] a){
        int result = 0;
        for(int i : a){
            result = gcd(result, i);
        }
        return result;
    }
}

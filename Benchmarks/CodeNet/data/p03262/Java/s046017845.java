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

        if(n == 1){
            System.out.println(a[0]);
            return;
        }

        int gcd = gcd(a[0], a[1]);

        for(int i = 2; i < n; i++){
            gcd = gcd(gcd, a[i]);
        }

        System.out.println(Math.abs(gcd));

    }

    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}

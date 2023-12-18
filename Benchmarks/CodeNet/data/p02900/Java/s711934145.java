import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();
        solve(A, B);
    }

    static void solve(long A, long B){
        long tmp;
        while ((tmp = A % B) != 0) {
            A = B;
            B = tmp;
        }
        long ans = 1;

        if(B%2==0) {
            while(B%2==0) {
                B /= 2;
            }
            ans++;
        }

        long i = 3;
        while (i < 1000000 && B != 1) {
            if(B%i==0) {
                while(B%i==0) {
                    B /= i;
                }
                ans++;
            }
            i += 2;
        }

        if(B != 1) ans++;
        System.out.println(ans);


    }
}

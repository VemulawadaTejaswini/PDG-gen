import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long n = sc.nextLong();
        long d = 1;
        long a = 0;
        long b = 0;


        for(int i=(int)A; i>=1; i--) {
            if(A%i==0 && B%i==0) {
                a = A/i;
                b = B/i;
                d = i;
                break;
            }
        }

        long res = 0;
        if (n >= B) {
            res = a * (B-1) / b;
        } else {
            res = a * n / b;
        }

        System.out.println(res);


    }



}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long S = (long)Math.sqrt(X)+1;
        boolean find = false;

        if((X % 2) == 0){
            long M = (long)Math.pow(X/2, 0.2);
            if(2*M*M*M*M*M == X){
                System.out.println(""+M+" "+(-M));
                find = true;
            }
        }

        for(long k = S ; k >= 1 && !find ; k--){
            if((X % k) == 0) {
                long Y = X / k;
                long b = 0;
                boolean flag = true;
                while (flag && !find) {
                    long var = prodP(b + k, b);
                    if (var == Y) {
                        System.out.println("" + (b + k) + " " + b);
                        find = true;
                        flag = false;
                    } else if (var > Y) {
                        flag = false;
                    }
                    b++;
                }

                flag = true;
                for (b = 0; b <= k && flag && !find; b++) {
                    long var = prodM(k - b, b);
                    if (var == Y) {
                        System.out.println("" + (k - b) + " " + (-b));
                        find = true;
                        flag = false;
                    }
                    b++;
                }

                b = 0;
                flag = true;
                while (flag && !find) {
                    long var = prodP(b + Y, b);
                    if (var == k) {
                        System.out.println("" + (b + Y) + " " + b);
                        find = true;
                        flag = false;
                    } else if (var > k) {
                        flag = false;
                    }
                    b++;
                }

                flag = true;
                for (b = 0; b <= Y && flag && !find; b++) {
                    long var = prodM(Y - b, b);
                    if (var == k) {
                        System.out.println("" + (Y - b) + " " + (-b));
                        find = true;
                        flag = false;
                    }
                    b++;
                }
            }
        }

    }

    public static long prodP(long c, long d){
        long a = c;
        long b = d;
        return (long)(a*a*a*a + a*a*a*b + a*a*b*b + a*b*b*b + b*b*b*b);
    }

    public static long prodM(long c, long d){
        long a = c;
        long b = d;
        return (long)(a*a*a*a - a*a*a*b + a*a*b*b - a*b*b*b + b*b*b*b);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int S = (int)Math.sqrt(X)+1;
        boolean find = false;

        if((X % 2) == 0){
            int M = (int)Math.pow(X/2, 0.2);
            if(2*M*M*M*M*M == X){
                System.out.println(""+M+" "+(-M));
                find = true;
            }
        }

        for(int k = S ; k >= 1 && !find ; k--){
            if((X % k) == 0) {
                int Y = X / k;
                int b = 0;
                boolean flag = true;
                while (flag && !find) {
                    int var = prodP(b + k, b);
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
                    int var = prodM(k - b, b);
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
                    int var = prodP(b + Y, b);
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
                    int var = prodM(Y - b, b);
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

    public static int prodP(int c, int d){
        long a = c;
        long b = d;
        return (int)(a*a*a*a + a*a*a*b + a*a*b*b + a*b*b*b + b*b*b*b);
    }

    public static int prodM(int c, int d){
        long a = c;
        long b = d;
        return (int)(a*a*a*a - a*a*a*b + a*a*b*b - a*b*b*b + b*b*b*b);
    }
}

import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        double xDouble = Double.valueOf(x);

        int ans = 0;
        double tot = 100;
        while (tot < xDouble) {
            tot = Math.floor(tot * 1.01);
            ans ++;
        }

        System.out.println(ans);    

    }
}

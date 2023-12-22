import java.util.*;

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
        
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();

            if (n == 0 && m == 0 && p == 0) break;

            int [] bets = new int[n];
            int total = 0;

            for(int i = 0; i < n; i++) {
                bets[i] = sc.nextInt();
                total += bets[i];
            }

            if (bets[m-1] == 0) {
                System.out.println("0");
            } else {
                total = total * (100 - p);
                System.out.println(total / bets[m-1]);
            }

        }

    }
}
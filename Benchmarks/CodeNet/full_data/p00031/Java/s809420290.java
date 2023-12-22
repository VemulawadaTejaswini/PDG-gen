import java.util.*;

class Main {

    static void solve (int n) {
        int weight = 2;

        while (n != 0) {
            if (n % weight != 0) {
                System.out.printf("%d ", weight / 2);
                n -= weight / 2;
            }
            weight *= 2;
        }
        
        System.out.println("");

    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int n = sc.nextInt();
            solve(n);
        }

    }
}
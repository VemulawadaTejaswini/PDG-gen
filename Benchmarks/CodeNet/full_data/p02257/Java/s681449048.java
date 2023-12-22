import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.IOException;

class Main {

    boolean isPrime(int n){
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        Main pn = new Main();
        List prime = new ArrayList();
        int ans = 0;

        while (sc.hasNextInt() && sc.nextLine() != "") {
            int n = sc.nextInt();
            if (pn.isPrime(n) && !prime.contains(n)) {
                prime.add(n);
                ans++;
            }
        }


        /**

        List prime = new ArrayList();
        PrimeNumbers pn = new PrimeNumbers();
        int ans = 0;
        int[] numbers = new int[]{11,7,8,9,10,11,12,13,14,15,16,17};
        for (int n: numbers) {

            if (pn.isPrime(n) && !prime.contains(n)) {
                prime.add(n);
                ans++;
            }
        }
         */
        System.out.println(ans);
    }
}


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            long n = Long.parseLong(br.readLine());
            printFactor(n);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void printFactor(long n){
        System.out.print(n + ":");
        factorize(n);
    }
    private static void factorize(long n){
        if (n==1){
            System.out.println();
            return;
        }
        System.out.print(" ");
        for (int i = 2; i <= n ; i++) {
            if(n%i==0){
                System.out.print(i);
                n = n/(long)i;
                break;
            }
        }
        factorize(n);
    }
}
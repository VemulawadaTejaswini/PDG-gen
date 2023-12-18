import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.close();
        long res = k;
        if(n > 1 && k > 2){
            for(long i = 2L; i <= n; i++){
                res *= (k - 1);
            }
        }
        System.out.println(res);
    }

}
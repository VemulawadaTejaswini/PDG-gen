import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.valueOf(sc.next());
            if(a[i]==0){
                System.out.println("0");
                return;
            }
        }

        long total = 1;;

        for (long i : a) {
            total *= i;
            if(total > 1000000000000000000L) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(total);
    }
}
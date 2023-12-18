import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        if (n<k){
            System.out.println(n);
        }else if (n%k==0){
            System.out.println(0);
        }else {
            long a = (n%k)-k;
            if (a<0){
                a = -a;
            }
            System.out.println(a);
        }
    }
}
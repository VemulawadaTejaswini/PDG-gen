import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long N;
        long A;
        long B;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextLong();
            A = sc.nextLong();
            B = sc.nextLong();
        }
        long C = A+B;
        if(C ==0){
            System.out.println(0);
            return;
        }
        long s = N /C;
        long a = N%C;
        long reult = (s * A) + (A > a ? a:A);
        System.out.println(reult);
    }
}

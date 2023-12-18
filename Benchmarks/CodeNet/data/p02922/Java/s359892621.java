import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long A;
        long B;

        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
            B = sc.nextLong();
        }
        int cnt = 0;

        System.out.println( (int)Math.ceil((double)(B-1)/(A-1) ));
    }

}

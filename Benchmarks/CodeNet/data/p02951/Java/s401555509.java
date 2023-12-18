import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        long A;
        long B;
        long C;

        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
            B = sc.nextLong();
            C = sc.nextLong();
        }
        if(C < (A -B )){
            System.out.println(0);
        }else{
            System.out.println(C -(A-B));
        }
        return;
    }
}

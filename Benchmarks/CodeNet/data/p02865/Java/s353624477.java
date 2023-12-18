
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long N;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextLong();
        }
        long result = N /2;
        if(N%2 == 0){
            result--;
        }
        System.out.println(result);

    }

}

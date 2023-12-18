import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static boolean found = false;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 1; i < b + 1; i++) {
            System.out.println((a * i));
            if ((a * i) % b == c) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

}
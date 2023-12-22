import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                for(int i = 0; i < 9; i++) {
                    n -= scn.nextInt();
                }
                System.out.println(n);
            }
        }
    }
}
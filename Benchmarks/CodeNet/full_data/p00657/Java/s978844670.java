import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int r, c;
            while((r = scn.nextInt()) > 0 | (c = scn.nextInt()) > 0) {
                System.out.println(r * c % 2 > 0 ? "no" : "yes");
            }
        }
    }
}
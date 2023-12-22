import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int sum = scn.nextInt() + scn.nextInt() + scn.nextInt() + scn.nextInt();
            System.out.println(sum / 60);
            System.out.println(sum % 60);
        }
    }
}
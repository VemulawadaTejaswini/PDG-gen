import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println(s.next().equals("ABC") ? "ARC" : "ABC");
        }
    }
}
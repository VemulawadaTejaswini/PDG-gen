import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int D = Integer.parseInt(sc.next());
            int T = Integer.parseInt(sc.next());
            int S = Integer.parseInt(sc.next());

            System.out.println(S* T >= D ? "Yes" : "No");
        }
    }
}

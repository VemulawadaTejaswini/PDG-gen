import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println(new Main().run(sc));
        }
    }

    public String run(Scanner sc) {
        int[] vars = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
        for(int i = 0; i < vars.length; i++) {
            if (vars[i] == 0) {
                return String.valueOf(i + 1);
            }
        }
        return "foo";
    }
}

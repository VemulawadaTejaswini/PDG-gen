import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ", 0);
        int d = Integer.parseInt(lines[0]);
        int t = Integer.parseInt(lines[1]);
        int s = Integer.parseInt(lines[2]);

        if (t * s < d) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}
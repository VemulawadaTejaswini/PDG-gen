import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        StringBuilder s = new StringBuilder(values[0]);
        line = scanner.nextLine();
        values = line.split(" ");
        long q = Long.parseLong(values[0]);
        for (int i = 0; i < q; i++) {
            line = scanner.nextLine();
            values = line.split(" ");
            int qi = Integer.parseInt(values[0]);
            if (qi == 1) {
                s.reverse();
            } else if(qi == 2) {
                int fi = Integer.parseInt(values[1]);
                if (fi == 1) {
                    s.reverse().append(values[2]).reverse();
                } else if(fi == 2) {
                    s.append(values[2]);
                }
            }
        }
        System.out.println(s.toString());
    }
}